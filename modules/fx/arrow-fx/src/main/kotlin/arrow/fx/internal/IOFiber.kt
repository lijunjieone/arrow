package arrow.fx.internal

import arrow.core.identity
import arrow.fx.IO
import arrow.fx.IOConnection
import arrow.fx.IOPartialOf
import arrow.fx.typeclasses.Fiber

internal fun <A> IOFiber(promise: UnsafePromise<Throwable, A>, conn: IOConnection): Fiber<IOPartialOf<Throwable>, A> {
  val join: IO<Throwable, A> = IO.Async(false, ::identity) { conn2, cb ->
    conn2.push(IO { promise.remove(cb) })

    promise.get { a ->
      cb(a)
      conn2.pop()
      conn.pop()
    }
  }

  return Fiber(join, conn.cancel())
}

---
title: KleisliInstances_KleisliMonadErrorFactory - arrow-dagger
---

[arrow-dagger](../../index.html) / [arrow.dagger.instances](../index.html) / [KleisliInstances_KleisliMonadErrorFactory](./index.html)

# KleisliInstances_KleisliMonadErrorFactory

`@Generated("dagger.internal.codegen.ComponentProcessor", "https://google.github.io/dagger") class KleisliInstances_KleisliMonadErrorFactory<F : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, D : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : Factory<MonadError<Kind<Kind<ForKleisli, `[`F`](index.html#F)`>, `[`D`](index.html#D)`>, `[`D`](index.html#D)`>>`

### Constructors

| [&lt;init&gt;](-init-.html) | `KleisliInstances_KleisliMonadErrorFactory(module: `[`KleisliInstances`](../-kleisli-instances/index.html)`<`[`F`](index.html#F)`, `[`D`](index.html#D)`>, evProvider: Provider<`[`DaggerKleisliMonadErrorInstance`](../-dagger-kleisli-monad-error-instance/index.html)`<`[`F`](index.html#F)`, `[`D`](index.html#D)`>>)` |

### Functions

| [create](create.html) | `static fun <F : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, D : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> create(module: `[`KleisliInstances`](../-kleisli-instances/index.html)`<`[`F`](create.html#F)`, `[`D`](create.html#D)`>, evProvider: Provider<`[`DaggerKleisliMonadErrorInstance`](../-dagger-kleisli-monad-error-instance/index.html)`<`[`F`](create.html#F)`, `[`D`](create.html#D)`>>): `[`KleisliInstances_KleisliMonadErrorFactory`](./index.html)`<`[`F`](create.html#F)`, `[`D`](create.html#D)`>` |
| [get](get.html) | `fun get(): MonadError<Kind<Kind<ForKleisli, `[`F`](index.html#F)`>, `[`D`](index.html#D)`>, `[`D`](index.html#D)`>` |
| [provideInstance](provide-instance.html) | `static fun <F : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, D : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> provideInstance(module: `[`KleisliInstances`](../-kleisli-instances/index.html)`<`[`F`](provide-instance.html#F)`, `[`D`](provide-instance.html#D)`>, evProvider: Provider<`[`DaggerKleisliMonadErrorInstance`](../-dagger-kleisli-monad-error-instance/index.html)`<`[`F`](provide-instance.html#F)`, `[`D`](provide-instance.html#D)`>>): MonadError<Kind<Kind<ForKleisli, `[`F`](provide-instance.html#F)`>, `[`D`](provide-instance.html#D)`>, `[`D`](provide-instance.html#D)`>` |
| [proxyKleisliMonadError](proxy-kleisli-monad-error.html) | `static fun <F : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, D : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> proxyKleisliMonadError(instance: `[`KleisliInstances`](../-kleisli-instances/index.html)`<`[`F`](proxy-kleisli-monad-error.html#F)`, `[`D`](proxy-kleisli-monad-error.html#D)`>, ev: `[`DaggerKleisliMonadErrorInstance`](../-dagger-kleisli-monad-error-instance/index.html)`<`[`F`](proxy-kleisli-monad-error.html#F)`, `[`D`](proxy-kleisli-monad-error.html#D)`>): MonadError<Kind<Kind<ForKleisli, `[`F`](proxy-kleisli-monad-error.html#F)`>, `[`D`](proxy-kleisli-monad-error.html#D)`>, `[`D`](proxy-kleisli-monad-error.html#D)`>` |

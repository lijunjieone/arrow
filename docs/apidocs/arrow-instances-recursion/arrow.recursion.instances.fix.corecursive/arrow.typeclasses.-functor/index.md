---
title: arrow.recursion.instances.fix.corecursive.arrow.typeclasses.Functor - arrow-instances-recursion
---

[arrow-instances-recursion](../../index.html) / [arrow.recursion.instances.fix.corecursive](../index.html) / [arrow.typeclasses.Functor](./index.html)

### Extensions for arrow.typeclasses.Functor

| [ana](ana.html) | `fun <F, A> Functor<`[`F`](ana.html#F)`>.ana(arg1: `[`A`](ana.html#A)`, arg2: (`[`A`](ana.html#A)`) -> Kind<`[`F`](ana.html#F)`, `[`A`](ana.html#A)`>): Fix<`[`F`](ana.html#F)`>` |
| [embed](embed.html) | `fun <F> Functor<`[`F`](embed.html#F)`>.embed(): (Kind<`[`F`](embed.html#F)`, Eval<Kind<ForFix, `[`F`](embed.html#F)`>>>) -> Eval<Kind<ForFix, `[`F`](embed.html#F)`>>` |
| [embedT](embed-t.html) | `fun <F> Functor<`[`F`](embed-t.html#F)`>.embedT(arg1: Kind<`[`F`](embed-t.html#F)`, Eval<Kind<ForFix, `[`F`](embed-t.html#F)`>>>): Eval<Kind<ForFix, `[`F`](embed-t.html#F)`>>` |

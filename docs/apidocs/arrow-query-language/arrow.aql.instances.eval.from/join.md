---
title: join - arrow-query-language
---

[arrow-query-language](../index.html) / [arrow.aql.instances.eval.from](index.html) / [join](./join.html)

# join

`@JvmName("join") infix fun <A, B, Z, X> `[`Query`](../arrow.aql/-query/index.html)`<ForEval, `[`A`](join.html#A)`, `[`Z`](join.html#Z)`>.join(query: `[`Query`](../arrow.aql/-query/index.html)`<ForEval, `[`B`](join.html#B)`, `[`X`](join.html#X)`>): `[`Query`](../arrow.aql/-query/index.html)`<ForEval, Tuple2<`[`A`](join.html#A)`, `[`B`](join.html#B)`>, Tuple2<`[`Z`](join.html#Z)`, `[`X`](join.html#X)`>>`
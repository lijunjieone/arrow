---
title: arrow.aql.instances.id.from - arrow-query-language
---

[arrow-query-language](../index.html) / [arrow.aql.instances.id.from](./index.html)

## Package arrow.aql.instances.id.from

### Extensions for External Classes

| [arrow.Kind](arrow.-kind/index.html) |  |
| [arrow.core.Id](arrow.core.-id/index.html) |  |

### Functions

| [applicative](applicative.html) | `fun applicative(): Applicative<ForId>` |
| [join](join.html) | `infix fun <A, B, Z, X> `[`Query`](../arrow.aql/-query/index.html)`<ForId, `[`A`](join.html#A)`, `[`Z`](join.html#Z)`>.join(query: `[`Query`](../arrow.aql/-query/index.html)`<ForId, `[`B`](join.html#B)`, `[`X`](join.html#X)`>): `[`Query`](../arrow.aql/-query/index.html)`<ForId, Tuple2<`[`A`](join.html#A)`, `[`B`](join.html#B)`>, Tuple2<`[`Z`](join.html#Z)`, `[`X`](join.html#X)`>>` |

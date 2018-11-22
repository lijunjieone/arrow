---
title: MapKTraverseInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [MapKTraverseInstance](./index.html)

# MapKTraverseInstance

`@extension interface MapKTraverseInstance<K> : Traverse<MapKPartialOf<`[`K`](index.html#K)`>>, `[`MapKFoldableInstance`](../-map-k-foldable-instance/index.html)`<`[`K`](index.html#K)`>`

### Functions

| [traverse](traverse.html) | `open fun <G, A, B> MapKOf<`[`K`](index.html#K)`, `[`A`](traverse.html#A)`>.traverse(AP: Applicative<`[`G`](traverse.html#G)`>, f: (`[`A`](traverse.html#A)`) -> Kind<`[`G`](traverse.html#G)`, `[`B`](traverse.html#B)`>): Kind<`[`G`](traverse.html#G)`, MapKOf<`[`K`](index.html#K)`, `[`B`](traverse.html#B)`>>` |

### Inheritors

| [MapKContext](../-map-k-context/index.html) | `class MapKContext<L> : `[`MapKTraverseInstance`](./index.html)`<`[`L`](../-map-k-context/index.html#L)`>` |

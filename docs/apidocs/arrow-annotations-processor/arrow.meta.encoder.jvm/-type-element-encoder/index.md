---
title: TypeElementEncoder - arrow-annotations-processor
---

[arrow-annotations-processor](../../index.html) / [arrow.meta.encoder.jvm](../index.html) / [TypeElementEncoder](./index.html)

# TypeElementEncoder

`interface TypeElementEncoder : `[`KotlinMetatadataEncoder`](../-kotlin-metatadata-encoder/index.html)`, `[`KotlinPoetEncoder`](../-kotlin-poet-encoder/index.html)`, `[`ProcessorUtils`](../../arrow.common.utils/-processor-utils/index.html)

### Properties

| [meta](meta.html) | `open val `[`TypeElement`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/TypeElement.html)`.meta: `[`Class`](../../arrow.common.utils/-class-or-package-data-wrapper/-class/index.html) |
| [typeElementToMeta](type-element-to-meta.html) | `abstract val typeElementToMeta: (classElement: `[`TypeElement`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/TypeElement.html)`) -> `[`ClassOrPackageDataWrapper`](../../arrow.common.utils/-class-or-package-data-wrapper/index.html) |

### Inherited Properties

| [hasNoCompanion](../../arrow.common.utils/-processor-utils/has-no-companion.html) | `open val `[`Element`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/Element.html)`.hasNoCompanion: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [typeNameToMeta](../-kotlin-poet-encoder/type-name-to-meta.html) | `abstract val typeNameToMeta: (typeName: TypeName) -> `[`TypeName`](../../arrow.meta.ast/-type-name/index.html) |

### Functions

| [allFunctions](all-functions.html) | `open fun `[`TypeElement`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/TypeElement.html)`.allFunctions(declaredElement: `[`TypeElement`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/TypeElement.html)`): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Func`](../../arrow.meta.ast/-func/index.html)`>` |
| [annotations](annotations.html) | `open fun `[`TypeElement`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/TypeElement.html)`.annotations(): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Annotation`](../../arrow.meta.ast/-annotation/index.html)`>` |
| [asConstructor](as-constructor.html) | `open fun `[`ExecutableElement`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/ExecutableElement.html)`.asConstructor(typeElement: `[`TypeElement`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/TypeElement.html)`): `[`Pair`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, `[`Func`](../../arrow.meta.ast/-func/index.html)`>?` |
| [asMetaType](as-meta-type.html) | `open fun `[`TypeElement`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/TypeElement.html)`.asMetaType(): `[`Type`](../../arrow.meta.ast/-type/index.html)`?` |
| [asTypeName](as-type-name.html) | `open fun `[`TypeElement`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/TypeElement.html)`.asTypeName(): `[`TypeName`](../../arrow.meta.ast/-type-name/index.html) |
| [declaredFunctions](declared-functions.html) | `open fun `[`TypeElement`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/TypeElement.html)`.declaredFunctions(declaredElement: `[`TypeElement`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/TypeElement.html)`): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Func`](../../arrow.meta.ast/-func/index.html)`>` |
| [fixReceiverLiterals](fix-receiver-literals.html) | `open fun `[`Func`](../../arrow.meta.ast/-func/index.html)`.fixReceiverLiterals(meta: `[`Class`](../../arrow.common.utils/-class-or-package-data-wrapper/-class/index.html)`, protoFun: Function): `[`Func`](../../arrow.meta.ast/-func/index.html) |
| [getTypeElement](get-type-element.html) | `open fun getTypeElement(name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, elements: `[`Elements`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/util/Elements.html)`): `[`TypeElement`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/TypeElement.html)`?` |
| [modifiers](modifiers.html) | `open fun `[`TypeElement`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/TypeElement.html)`.modifiers(): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Modifier`](../../arrow.meta.ast/-modifier/index.html)`>` |
| [packageName](package-name.html) | `open fun `[`Element`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/Element.html)`.packageName(): `[`Either`](../../arrow.meta/-either/index.html)`<`[`EncodingError`](../-encoding-error/index.html)`, `[`PackageName`](../../arrow.meta.ast/-package-name/index.html)`>` |
| [processorUtils](processor-utils.html) | `abstract fun processorUtils(): `[`ProcessorUtils`](../../arrow.common.utils/-processor-utils/index.html) |
| [properties](properties.html) | `open fun `[`TypeElement`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/TypeElement.html)`.properties(): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Property`](../../arrow.meta.ast/-property/index.html)`>` |
| [sealedSubClassNames](sealed-sub-class-names.html) | `open fun `[`TypeElement`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/TypeElement.html)`.sealedSubClassNames(): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`TypeName`](../../arrow.meta.ast/-type-name/index.html)`>` |
| [superInterfaces](super-interfaces.html) | `open fun `[`TypeElement`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/TypeElement.html)`.superInterfaces(): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`TypeName`](../../arrow.meta.ast/-type-name/index.html)`>` |
| [tree](tree.html) | `open fun `[`Element`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/Element.html)`.tree(): `[`Either`](../../arrow.meta/-either/index.html)`<`[`EncodingError`](../-encoding-error/index.html)`, `[`Tree`](../../arrow.meta.ast/-tree.html)`>` |
| [type](type.html) | `open fun `[`Element`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/Element.html)`.type(): `[`Either`](../../arrow.meta/-either/index.html)`<`[`EncodingError`](../-encoding-error/index.html)`, `[`Type`](../../arrow.meta.ast/-type/index.html)`>` |
| [typeVariables](type-variables.html) | `open fun `[`TypeElement`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/TypeElement.html)`.typeVariables(): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`TypeVariable`](../../arrow.meta.ast/-type-name/-type-variable/index.html)`>` |

### Inherited Functions

| [asClassOrPackageDataWrapper](../../arrow.common.utils/-processor-utils/as-class-or-package-data-wrapper.html) | `open fun KotlinMetadata.asClassOrPackageDataWrapper(classElement: `[`TypeElement`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/TypeElement.html)`): `[`ClassOrPackageDataWrapper`](../../arrow.common.utils/-class-or-package-data-wrapper/index.html)`?` |
| [asModifier](../-kotlin-metatadata-encoder/as-modifier.html) | `open fun Visibility.asModifier(): `[`Modifier`](../../arrow.meta.ast/-modifier/index.html)`?`<br>`open fun Modality.asModifier(): `[`Modifier`](../../arrow.meta.ast/-modifier/index.html) |
| [asTypeName](../-kotlin-metatadata-encoder/as-type-name.html) | `open fun Type.asTypeName(meta: `[`Class`](../../arrow.common.utils/-class-or-package-data-wrapper/-class/index.html)`): `[`TypeName`](../../arrow.meta.ast/-type-name/index.html) |
| [declaredTypeClassInterfaces](../../arrow.common.utils/-processor-utils/declared-type-class-interfaces.html) | `open fun `[`Class`](../../arrow.common.utils/-class-or-package-data-wrapper/-class/index.html)`.declaredTypeClassInterfaces(typeTable: TypeTable): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`ClassOrPackageDataWrapper`](../../arrow.common.utils/-class-or-package-data-wrapper/index.html)`>` |
| [extractFullName](../-kotlin-metatadata-encoder/extract-full-name.html) | `open fun Type.extractFullName(classData: `[`ClassOrPackageDataWrapper`](../../arrow.common.utils/-class-or-package-data-wrapper/index.html)`, outputTypeAlias: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = true): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [getClassData](../../arrow.common.utils/-processor-utils/get-class-data.html) | `open fun `[`Element`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/Element.html)`.getClassData(): `[`Class`](../../arrow.common.utils/-class-or-package-data-wrapper/-class/index.html) |
| [getClassOrPackageDataWrapper](../../arrow.common.utils/-processor-utils/get-class-or-package-data-wrapper.html) | `open fun getClassOrPackageDataWrapper(classElement: `[`TypeElement`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/TypeElement.html)`): `[`ClassOrPackageDataWrapper`](../../arrow.common.utils/-class-or-package-data-wrapper/index.html) |
| [getConstructorParamNames](../../arrow.common.utils/-processor-utils/get-constructor-param-names.html) | `open fun `[`Element`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/Element.html)`.getConstructorParamNames(): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
| [getConstructorTypesNames](../../arrow.common.utils/-processor-utils/get-constructor-types-names.html) | `open fun `[`Element`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/Element.html)`.getConstructorTypesNames(): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
| [getFunction](../../arrow.common.utils/-processor-utils/get-function.html) | `open fun `[`ClassOrPackageDataWrapper`](../../arrow.common.utils/-class-or-package-data-wrapper/index.html)`.getFunction(methodElement: `[`ExecutableElement`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/ExecutableElement.html)`): Function` |
| [kotlinMetadataUtils](../-kotlin-poet-encoder/kotlin-metadata-utils.html) | `abstract fun kotlinMetadataUtils(): KotlinMetadataUtils` |
| [metaApi](../-kotlin-poet-encoder/meta-api.html) | `abstract fun metaApi(): `[`MetaApi`](../../arrow.meta.encoder/-meta-api/index.html) |
| [modifiersFromFlags](../-kotlin-metatadata-encoder/modifiers-from-flags.html) | `open fun modifiersFromFlags(flags: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Modifier`](../../arrow.meta.ast/-modifier/index.html)`>` |
| [nameOf](../-kotlin-metatadata-encoder/name-of.html) | `open fun `[`Class`](../../arrow.common.utils/-class-or-package-data-wrapper/-class/index.html)`.nameOf(id: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [overrides](../../arrow.common.utils/-processor-utils/overrides.html) | `open fun Function.overrides(o: Function): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [supertypes](../-kotlin-metatadata-encoder/supertypes.html) | `open fun supertypes(current: `[`Class`](../../arrow.common.utils/-class-or-package-data-wrapper/-class/index.html)`, typeTable: TypeTable, processorUtils: `[`ProcessorUtils`](../../arrow.common.utils/-processor-utils/index.html)`, acc: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`ClassOrPackageDataWrapper`](../../arrow.common.utils/-class-or-package-data-wrapper/index.html)`>): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`ClassOrPackageDataWrapper`](../../arrow.common.utils/-class-or-package-data-wrapper/index.html)`>` |
| [toMeta](../-kotlin-metatadata-encoder/to-meta.html) | `open fun Modality.toMeta(): `[`Modifier`](../../arrow.meta.ast/-modifier/index.html)<br>`open fun ValueParameter.toMeta(owner: `[`Class`](../../arrow.common.utils/-class-or-package-data-wrapper/-class/index.html)`): `[`Parameter`](../../arrow.meta.ast/-parameter/index.html)<br>`open fun Variance.toMeta(): `[`Modifier`](../../arrow.meta.ast/-modifier/index.html)<br>`open fun TypeParameter.toMeta(owner: `[`Class`](../../arrow.common.utils/-class-or-package-data-wrapper/-class/index.html)`): `[`TypeVariable`](../../arrow.meta.ast/-type-name/-type-variable/index.html)<br>`open fun Function.toMeta(owner: `[`Class`](../../arrow.common.utils/-class-or-package-data-wrapper/-class/index.html)`, executableElement: `[`ExecutableElement`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/ExecutableElement.html)`): `[`Func`](../../arrow.meta.ast/-func/index.html) |
| [toMeta](../-kotlin-poet-encoder/to-meta.html) | `open fun FunSpec.toMeta(element: `[`ExecutableElement`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/ExecutableElement.html)`): `[`Func`](../../arrow.meta.ast/-func/index.html)<br>`open fun AnnotationSpec.toMeta(): `[`Annotation`](../../arrow.meta.ast/-annotation/index.html)<br>`open fun TypeVariableName.toMeta(): `[`TypeVariable`](../../arrow.meta.ast/-type-name/-type-variable/index.html)<br>`open fun TypeName.toMeta(): `[`TypeName`](../../arrow.meta.ast/-type-name/index.html) |
| [typeNameToMetaImpl](../-kotlin-poet-encoder/type-name-to-meta-impl.html) | `open fun typeNameToMetaImpl(typeName: TypeName): `[`TypeName`](../../arrow.meta.ast/-type-name/index.html) |

### Extension Functions

| [log](../../arrow.common.messager/me.eugeniomarletti.kotlin.processing.-kotlin-processing-environment/log.html) | `fun KotlinProcessingEnvironment.log(message: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, element: `[`Element`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/Element.html)`? = null, annotationMirror: `[`AnnotationMirror`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/AnnotationMirror.html)`? = null, annotationValue: `[`AnnotationValue`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/AnnotationValue.html)`? = null): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [logE](../../arrow.common.messager/me.eugeniomarletti.kotlin.processing.-kotlin-processing-environment/log-e.html) | `fun KotlinProcessingEnvironment.logE(message: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, element: `[`Element`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/Element.html)`? = null, annotationMirror: `[`AnnotationMirror`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/AnnotationMirror.html)`? = null, annotationValue: `[`AnnotationValue`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/AnnotationValue.html)`? = null): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [logMW](../../arrow.common.messager/me.eugeniomarletti.kotlin.processing.-kotlin-processing-environment/log-m-w.html) | `fun KotlinProcessingEnvironment.logMW(message: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, element: `[`Element`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/Element.html)`? = null, annotationMirror: `[`AnnotationMirror`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/AnnotationMirror.html)`? = null, annotationValue: `[`AnnotationValue`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/AnnotationValue.html)`? = null): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [logW](../../arrow.common.messager/me.eugeniomarletti.kotlin.processing.-kotlin-processing-environment/log-w.html) | `fun KotlinProcessingEnvironment.logW(message: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, element: `[`Element`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/Element.html)`? = null, annotationMirror: `[`AnnotationMirror`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/AnnotationMirror.html)`? = null, annotationValue: `[`AnnotationValue`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/element/AnnotationValue.html)`? = null): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

### Inheritors

| [JvmMetaApi](../-jvm-meta-api/index.html) | `interface JvmMetaApi : `[`MetaApi`](../../arrow.meta.encoder/-meta-api/index.html)`, `[`TypeElementEncoder`](./index.html)`, `[`ProcessorUtils`](../../arrow.common.utils/-processor-utils/index.html)`, `[`TypeDecoder`](../../arrow.meta.decoder/-type-decoder/index.html)<br>A JVM implementation of the Meta Api meant to be mixed in with kapt annotation processors |

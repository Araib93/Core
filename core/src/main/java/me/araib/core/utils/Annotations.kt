package me.araib.core.utils

/**
 * @param author : defines who created this class
 * @param modifiedBy : defines who edited this class other than author
 * @param purpose : defines purpose of the class
 * @param provides : defines all the methods exposed by the class for usage
 * @param requires : defines all the methods that are expected to be override as required
 * */
@Retention(AnnotationRetention.SOURCE)
@Target(AnnotationTarget.CLASS)
@MustBeDocumented
annotation class ExposedClass(
    val author: String,
    val modifiedBy: Array<String> = [],
    val purpose: String,
    val provides: Array<String> = [],
    val requires: Array<String> = []
)

/**
 * @param author : defines who created this function, change if different from {@see ExposedClass::author]
 * @param modifiedBy : defines who edited this class other than author
 * @param purpose : defines purpose of the class
 * @param returns : defines return value
 * */
@Retention(AnnotationRetention.SOURCE)
@Target(AnnotationTarget.FUNCTION)
@MustBeDocumented
annotation class ExposedProvideFunction(
    val author: String = "",
    val modifiedBy: Array<String> = [],
    val purpose: String,
    val returns: Array<String> = []
)

/**
 * @param author : defines who created this function, change if different from {@see ExposedClass::author]
 * @param modifiedBy : defines who edited this class other than author
 * @param purpose : defines purpose of the class
 * @param returns : defines return value
 * */
@Retention(AnnotationRetention.SOURCE)
@Target(AnnotationTarget.FUNCTION)
@MustBeDocumented
annotation class ExposedImplementFunction(
    val author: String = "",
    val modifiedBy: Array<String> = [],
    val purpose: String,
    val returns: Array<String> = []
)

/**
 * @param author : defines who created this property, change if different from {@see ExposedClass::author]
 * @param modifiedBy : defines who edited this class other than author
 * @param purpose : defines purpose of the class
 * */
@Retention(AnnotationRetention.SOURCE)
@Target(AnnotationTarget.PROPERTY)
@MustBeDocumented
annotation class ExposedProperty(
    val author: String = "",
    val modifiedBy: Array<String> = [],
    val purpose: String
)

/**
 * @param values : defines possible values of the property
*/
@Retention(AnnotationRetention.SOURCE)
@Target(AnnotationTarget.PROPERTY)
@Repeatable
annotation class PossibleValue(
    val values: Array<String>
)

/**
 * @param name: defines the name of parameter
 * @param values : defines possible values of the property
 */
@Retention(AnnotationRetention.SOURCE)
@Target(AnnotationTarget.FUNCTION)
@Repeatable
annotation class PossibleValues(
    val name: String,
    val values: Array<String>
)
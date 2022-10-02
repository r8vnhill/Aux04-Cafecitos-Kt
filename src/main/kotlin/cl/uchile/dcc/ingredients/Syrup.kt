package cl.uchile.dcc.ingredients


/**
 * ``Syrup`` is a type of [Ingredient].
 *
 * @param content   the content of the syrup in milliliters
 * @constructor Creates a given amount of syrup
 */
class Syrup(content: Int) : AbstractIngredient(content, "Syrup")
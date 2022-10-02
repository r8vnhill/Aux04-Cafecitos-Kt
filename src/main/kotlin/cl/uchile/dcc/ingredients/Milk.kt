package cl.uchile.dcc.ingredients


/**
 * ``Milk`` is a type of [Ingredient]
 *
 * @param content   the content of the milk in milliliters
 * @constructor Creates a given amount of milk
 */
class Milk(content: Int) : AbstractIngredient(content, "Milk")
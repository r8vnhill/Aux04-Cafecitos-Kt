package cl.uchile.dcc.ingredients

/**
 * This file contains an interface to represent ingredients, and an abstract class to hold common
 * functionality.
 */

/** An interface to represent ingredients.  */
interface Ingredient

/**
 * An abstract class to hold common functionality for [Ingredient]s.
 *
 *  @property content   The content in milliliters.
 *  @property ingredientName   The name of the ingredient.
 */
abstract class AbstractIngredient(private var content: Int, private val ingredientName: String) :
        Ingredient {
    override fun toString() = "$ingredientName{content=$content}"
}
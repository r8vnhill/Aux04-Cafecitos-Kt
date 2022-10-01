package cl.uchile.dcc.drinks

import cl.uchile.dcc.ingredients.Ingredient


/**
 * Represents a glass with [Ingredient]s.
 *
 * @property ingredients The [Ingredient]s in the glass.
 * @property totalContent The total content of the glass in milliliters.
 *
 * @param _ingredients The [Ingredient]s in the glass.
 * @constructor Creates a new glass with [Ingredient]s.
 */
class Glass(private var _ingredients: List<Ingredient>) {
    private val ingredients: List<Ingredient>
        get() = _ingredients.toList()
    private val totalContent = 0

    /** Empties the contents of the glass. */
    fun emptyContent() {
        // Do something uwu
    }
}
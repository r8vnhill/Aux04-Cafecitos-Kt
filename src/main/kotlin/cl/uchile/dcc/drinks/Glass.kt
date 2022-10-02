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
class Glass(private var _ingredients: MutableList<Ingredient> = mutableListOf()) {
    private val ingredients: List<Ingredient>
        get() = _ingredients.toList()
    val totalContent: Int
        get() = ingredients.sumOf { it.content }

    /** Empties the contents of the glass. */
    fun emptyContent() = _ingredients.clear()

    fun isEmpty() = _ingredients.isEmpty()

    fun add(ingredient: Ingredient) = _ingredients.add(ingredient)
}
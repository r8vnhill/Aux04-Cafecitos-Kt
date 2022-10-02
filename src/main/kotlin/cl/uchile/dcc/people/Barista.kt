package cl.uchile.dcc.people

import cl.uchile.dcc.drinks.Glass
import cl.uchile.dcc.ingredients.Ingredient


/**
 * This class represents a barista.
 * A barista is a person that can make coffee.
 *
 * @param name  The name of the barista
 * @constructor Creates a new barista
 */
class Barista(name: String) : Person(name, true) {
    override fun toString() = "Barista { name=$name }"

    /**
     * Makes a coffee with the given ingredients.
     *
     * @param ingredients   The ingredients to make the coffee
     * @return  The glass with the coffee
     */
    fun makeCoffee(ingredients: List<Ingredient>): Glass = TODO()
}
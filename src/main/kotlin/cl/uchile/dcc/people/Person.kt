package cl.uchile.dcc.people

import cl.uchile.dcc.drinks.Glass
import java.util.Objects


/**
 * This class represents a common person.
 *
 * @property name           The name of the person
 * @property canMakeCoffee  Whether the person can make coffee or not
 *
 * @constructor Creates a new person
 */
open class Person(protected val name: String, private val canMakeCoffee: Boolean = false) {
    override fun equals(other: Any?) = when {
        this === other -> true
        other !is Person -> false
        other::class != this::class -> false
        else -> this.name == other.name
                && this.canMakeCoffee == other.canMakeCoffee
    }

    override fun hashCode() = Objects.hash(Person::class, name, canMakeCoffee)

    override fun toString() = "Person { name=$name, canMakeCoffee=$canMakeCoffee }"

    fun drink(drinkable: Glass) = println("$name is drinking $drinkable")
}
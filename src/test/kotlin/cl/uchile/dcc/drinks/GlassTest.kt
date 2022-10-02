package cl.uchile.dcc.drinks

import cl.uchile.dcc.ingredients.Coffee
import cl.uchile.dcc.ingredients.Ingredient
import cl.uchile.dcc.ingredients.Milk
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe


class GlassTest : FunSpec({
    lateinit var glass1: Glass
    lateinit var glass2: Glass
    lateinit var ingredients: MutableList<Ingredient>

    beforeEach {
        glass1 = Glass()
        ingredients = mutableListOf(Coffee(60), Milk(180))
        glass2 = Glass(ingredients)
    }

    test("The total content of a glass should be correct") {
        glass1.totalContent shouldBe 0
        glass2.totalContent shouldBe 240
    }
})
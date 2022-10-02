package cl.uchile.dcc.people

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNot
import io.kotest.matchers.shouldNotBe
import io.kotest.matchers.types.haveSameHashCodeAs
import io.kotest.matchers.types.shouldNotBeSameInstanceAs

lateinit var barista1: Barista
lateinit var barista2: Barista
lateinit var barista3: Barista

class BaristaTest : FunSpec({
    beforeEach {
        setUpPeople()
        barista1 = Barista("Mario")
        barista2 = Barista("Mario")
        barista3 = Barista("María")
    }

    test("Two baristas with the same name should be equal") {
        barista1 shouldNotBeSameInstanceAs barista2
        barista1 shouldBe barista2
    }

    test("Two baristas with different names should not be equal") {
        barista1 shouldNotBe barista3
    }

    test("A Barista and a Person with the same name should not be equal") {
        barista1 shouldNotBe person1
    }

    test("The string representation of a barista should be correct") {
        "$barista1" shouldBe "Barista { name=Mario }"
    }

    test("A Barista and a Person with the same name should not have the same hash code") {
        barista1 shouldNot haveSameHashCodeAs(person1)
    }
})
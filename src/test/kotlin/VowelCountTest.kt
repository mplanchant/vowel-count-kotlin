package uk.co.logiccache.vowel

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

internal class VowelCountTest : StringSpec({

    "empty string" {
        vowelCount("") shouldBe 0
    }

    "blank string" {
        vowelCount("                  ") shouldBe 0
    }

    "no vowels" {
        vowelCount("qwsdfrtyhjk") shouldBe 0
    }

    "one vowel" {
        vowelCount("qwsdfrtyahjk") shouldBe 1
    }

    "two vowels" {
        vowelCount("qewsdfrtyahjk") shouldBe 2
    }

    "all the vowels" {
        vowelCount("aeiou") shouldBe 5
    }

    "all the vowels twice" {
        vowelCount("aeiaeiouou") shouldBe 10
    }
})
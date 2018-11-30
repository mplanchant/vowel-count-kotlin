package uk.co.logiccache.vowel

fun vowelCount(characters: String): Int {
    val vowels = setOf('a','e','i','o','u')
    return characters.count { c -> vowels.contains(c) }
}
fun palindromePermutation(a: String): Boolean {
    val table = Array(128) { 0 }

    for (c in a) {
        val lower = c.lowercaseChar()

        if (lower.code in 97..122) {
            table[lower.code]++
        }
    }

    var count = 0
    for (c in 'a'..'z') {
        if (table[c.code] % 2 == 1) count++
        if (count == 2) return false
    }

    return true
}

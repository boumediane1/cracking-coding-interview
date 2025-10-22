fun palindromePermutation(a: String): Boolean {
    val map = mutableMapOf<Char, Int>()

    for (c in a) {
        val c = c.lowercaseChar()
        map[c] = map.getOrDefault(c, 0) + 1
    }

    var count = 0
    for (c in 'a' until 'z') {
        if (map[c]?.rem(2) == 1) {
            count++

            if (count == 2) {
                return false
            }
        }
    }

    return true
}

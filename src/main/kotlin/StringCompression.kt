fun stringCompression(s: String): String {
    var count = 1
    var result = ""

    for (i in 0 until s.length - 1) {
        if (s[i] == s[i + 1]) {
            count++
        } else {
            result += "${s[i]}$count"
            count = 1
        }

        if (i == s.length - 2) {
            result += "${s[i]}$count"
        }
    }

    return result
}

fun oneAway(s: String, p: String): Boolean {
    if (s.length == p.length) {
        var count = 0

        for (i in 0 until s.length) {
            if (s[i] != p[i]) {
                count++

                if (count == 2) {
                    return false
                }
            }
        }

        return true
    }

    val bigger = if (s.length > p.length) s else p;
    val smaller = if (s.length < p.length) s else p;

    var count = 0
    var i = 0
    var j = 0

    while (i < bigger.length && j < smaller.length) {
        if (bigger[i] != smaller[j]) {
            count++

            if (count == 2) {
                return false
            }

            i++
        } else {
            i++
            j++
        }
    }

    return true

}

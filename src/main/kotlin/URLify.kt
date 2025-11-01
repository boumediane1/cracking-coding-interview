fun urlify(url: String, n: Int): String {
    val url = url.toCharArray()

    var i = n - 1
    var end = n - 1

    while (i >= 0) {
        while (i >= 0 && url[i] != ' ') {
            i--
        }

        if (i == -1) {
            break
        }

        for (j in end downTo i + 1) {
            url[j + 2] = url[j]
        }

        url[i] = '%'
        url[i + 1] = '2'
        url[i + 2] = '0'

        end += 2
    }

    return url.joinToString("").trim()
}

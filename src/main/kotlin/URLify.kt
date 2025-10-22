fun urlify(url: String): String {
    val url = url.toCharArray()

    var i = 0
    while (i < url.size) {
        if (url[i] == ' ') {
            for (j in url.size - 3 downTo i + 1) {
                url[j + 2] = url[j]
                url[j + 1] = url[j - 1]
            }

            url[i] = '%'
            url[i + 1] = '2'
            url[i + 2] = '0'
            i += 3
        }

        i++
    }

    return url.contentToString()
}

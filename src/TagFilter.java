/**
 * Tagfilter removes the tags with regex, replaces placeholder with umlauts and returns the filtered string.
 */
class TagFilter {

    /**
     * Removes the tags with regex, replaces placeholder with umlauts and returns the filtered string.
     * @param text String with text from file
     * @return Text without html tags
     */
    String removeTags(String text) {

        return text.replaceAll("<!--([\\s\\S]*)-->", "")
                .replaceAll("<style([\\s\\S]+?)</style>", "")
                .replaceAll("<script([\\s\\S]+?)</script>", "")
                .replaceAll("<noscript([\\s\\S]+?)</noscript>", "")
                .replaceAll("<.[^>]*>|</.>", "") //replace left over tags
                .replaceAll("\\n", " ")
                .replaceAll("^ +| +$|( )+", "$1")
                .replaceAll("&auml", "ä").replaceAll("&Auml", "Ä")
                .replaceAll("&oml", "ö").replaceAll("&Oml", "Ö")
                .replaceAll("&uuml", "ü").replaceAll("&Uuml", "Ü")
                .replaceAll("&szlig", "ß").replaceAll("&lt", "<")
                .replaceAll("&gt", ">").replaceAll("&amp", "&")
                .replaceAll("&quot", "\"").replaceAll("&nbsp", " ");
    }
}
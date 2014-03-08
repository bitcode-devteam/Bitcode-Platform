<%@page import="io.bitcode.Searcher"%>
<%= new Searcher().getSearchResults(request, response) %>

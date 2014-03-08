package io.bitcode;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Arix
 */
public class Searcher extends HttpServlet {
    
    
    
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    }
    
    public String getSearchResults(HttpServletRequest request, HttpServletResponse response) {
        ArrayList<Project> pResults = new ArrayList();
        String output = "<div class='resultList'><ul>\n";
        
        ArrayList<Project> projectList = new ArrayList();
        projectList.add(new Project("Test 1", "http://bitcode.io:8080/Bitcode_Platform/images/bars.png"));
        projectList.add(new Project("Test 2", "http://bitcode.io:8080/Bitcode_Platform/images/bars.png"));
        projectList.add(new Project("Test 3", "http://bitcode.io:8080/Bitcode_Platform/images/bars.png"));
        projectList.add(new Project("Test 4", "http://bitcode.io:8080/Bitcode_Platform/images/bars.png"));
        projectList.add(new Project("Test 5", "http://bitcode.io:8080/Bitcode_Platform/images/bars.png"));
        projectList.add(new Project("Test 6", "http://bitcode.io:8080/Bitcode_Platform/images/bars.png"));
        projectList.add(new Project("Test 7", "http://bitcode.io:8080/Bitcode_Platform/images/bars.png"));
        String query = request.getParameter("q");
        
        for(Project p : projectList) {
            if(p.title.toLowerCase().contains(query.toLowerCase())) {
                pResults.add(p);
            }
        }
        
        for(Project p : pResults) {
            output += "<li><img src='" + p.thumbnail + "'/><a href=''>" + p.title + "</a></li>\n";
        }
        return output + "</ul></div>";
    }
}

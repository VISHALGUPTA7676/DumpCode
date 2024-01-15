package com.office.crud;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.google.gson.Gson;
import com.office.crud.pojo.Country;
import com.office.crud.pojo.MasterLanguage;
import com.office.crud.pojo.State;
import com.office.crud.pojo.UserType;
import com.office.crud.servicem.UserService;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class UserController
 */
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String action = request.getParameter("action");
		System.out.println(action);
		UserService userService = new UserService();
		
		if(action.equals("getCountry")) {
			List<Country> countries= new ArrayList<>();
			 ServletContext st=getServletContext();
			countries = userService.getCountryList();
			if(st.getAttribute("selectedCountryId") == null) {
				System.out.println("inside");
			}
			
			List<UserType> userTypes=userService.getUserType();
			List<MasterLanguage> language = new  ArrayList<>();
			language=userService.getLanguage();
			HashMap<String, Object> object = new HashMap<>();
			object.put("country", countries);
			object.put("userType", userTypes);
			object.put("language", language);
			//HttpSession httpSession = request.getSession();
			//request.setAttribute("countryDetails", countries);
			
			System.out.println(countries);
			String jsonCountries = new Gson().toJson(object);

	        response.setContentType("application/json");
	        response.getWriter().write(jsonCountries);
	        
		}else if(action.equals("getStateById")) {
			System.out.println("jjbjdbhjd");
			System.err.println("getStateById");
			short countryId= Short.parseShort(request.getParameter("id"));
			System.out.println(countryId);
			List<State> states = new ArrayList<>();
			
			states=userService.getStateById(countryId);
			System.out.println("states"+  states);
			String jsonStates=new Gson().toJson(states);
			response.setContentType("application/json");
			response.getWriter().write(jsonStates);
		}
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

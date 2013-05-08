package edu.ycp.cs320.gamingwebsite.server;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.ycp.cs320.gamingwebsite.shared.Login;

@SuppressWarnings("serial")
public class Highscores extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		try {
		
		// The path info is the part of the URL that follows the
		// part identifying the servlet.  For example, if the
		// URL was http://hostname/receipts/42, and assuming that
		// "/receipts" is the path to the servlet, the path info
		// would be "/42".
		String info = req.getPathInfo();
		System.out.println("Path info is: " + info);
		
		if(info == null){
			List<Login> login = DBUtil.instance().getLogin();
			resp.setStatus(HttpServletResponse.SC_OK);
			resp.setContentType("text/plain");
			
			for(Login l: login){
				resp.getWriter().println(l.getId() + " , " + l.getUser() + " , " + l.getMemscore());
			}

		}else{
			if(info.startsWith("/")){
				info.substring(1);
			}
			try{
				//int id = Integer.parseInt(info);
			}catch(NumberFormatException e){
				badRequest(resp);
				return;
			}
		}
		} catch (SQLException e) {
			throw new ServletException("SQL exception getting high scores", e);
		}
	}
	
	private void badRequest(HttpServletResponse resp) throws IOException {
		resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
		resp.setContentType("text/plain");
		resp.getWriter().println("invalid entry");
	}
}

/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-09-14 12:36:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.com.caelum.agenda.modelo.Contato;
import java.util.List;
import br.com.caelum.agenda.dao.ContatoDao;

public final class listaContato_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>JSP</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\t");
      out.write('\n');
      out.write('\n');
      out.write('	');

		String mensagem = "Bem vindo ao sistema de agenda do FJ-21!";
	
      out.write('\n');
      out.write('\n');
      out.write('	');

		out.println(mensagem);
	
      out.write('\n');
      out.write('\n');
      out.write('	');

		String desenvolvido = "Desenvolvido por Danilo Santos";
	
      out.write('\n');
      out.write('\n');
      out.write('	');
      out.print(desenvolvido);
      out.write("\n");
      out.write("\n");
      out.write("\t<br>\n");
      out.write("\n");
      out.write("\t");

		System.out.println("Tudo foi executado!");
	
      out.write("\n");
      out.write("\n");
      out.write("\t<table>\n");
      out.write("\t\t");

			ContatoDao dao = new ContatoDao();
			List<Contato> contatos = dao.getLista();

			for (Contato contato : contatos) {
		
      out.write("\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<td>");
      out.print(contato.getNome());
      out.write("</td>\n");
      out.write("\t\t\t<td>");
      out.print(contato.getEmail());
      out.write("</td>\n");
      out.write("\t\t\t<td>");
      out.print(contato.getEndereco());
      out.write("</td>\n");
      out.write("\t\t\t<td>");
      out.print(contato.formataData());
      out.write("</td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t");

			}
		
      out.write("\n");
      out.write("\n");
      out.write("\t</table>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

package org.apache.jsp.view.student;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class view_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${student.user.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<h1>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${student.user.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</h1>\r\n");
      out.write("\t\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\t<div align=\"center\">\r\n");
      out.write("  <table width=\"825\" border=\"1\">\r\n");
      out.write("    <tr>\r\n");
      out.write("      <th colspan=\"5\" scope=\"col\">Student Details</th>\r\n");
      out.write("      </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td>Examination*</td>\r\n");
      out.write("      <td colspan=\"4\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${student.examinationName.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td>Year*</td>\r\n");
      out.write("      <td colspan=\"4\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${student.year}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td>Part/Semester*</td>\r\n");
      out.write("      <td colspan=\"4\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${student.semesterName.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td width=\"413\">Name*</td>\r\n");
      out.write("      <td colspan=\"4\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${student.user.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td>Date of Birth*</td>\r\n");
      out.write("      <td colspan=\"4\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${student.dateOfBirth}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td rowspan=\"2\">Place of Birth*</td>\r\n");
      out.write("      <td width=\"109\">Town</td>\r\n");
      out.write("      <td width=\"115\">Distt.</td>\r\n");
      out.write("      <td colspan=\"2\">State</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${student.placeOfBirth.town}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("      <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${student.placeOfBirth.distt}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("      <td colspan=\"2\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${student.placeOfBirth.state}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td>Email Address*</td>\r\n");
      out.write("      <td colspan=\"4\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${student.user.emailAddress}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td>Nationality*</td>\r\n");
      out.write("      <td colspan=\"4\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${student.nationality}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td>Religion*</td>\r\n");
      out.write("      <td colspan=\"4\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${student.religion}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td>Gender*</td>\r\n");
      out.write("      <td colspan=\"4\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${student.gender.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td>Father's Name*</td>\r\n");
      out.write("      <td colspan=\"4\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${student.fatherName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td>Mother's Name*</td>\r\n");
      out.write("      <td colspan=\"4\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${student.motherName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td>Spouse's Name*</td>\r\n");
      out.write("      <td colspan=\"4\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${student.spouseName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td>Mobile Number*</td>\r\n");
      out.write("      <td colspan=\"4\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${student.mobileNumber}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td rowspan=\"2\">Home Address*</td>\r\n");
      out.write("      <td>Street</td>\r\n");
      out.write("      <td>City</td>\r\n");
      out.write("      <td width=\"79\">State</td>\r\n");
      out.write("      <td width=\"75\">Pincode</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${student.correspondenceAddress.street}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("      <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${student.correspondenceAddress.city}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("      <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${student.correspondenceAddress.state}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("      <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${student.correspondenceAddress.pincode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td rowspan=\"2\">Permanent Address*</td>\r\n");
      out.write("      <td>Street</td>\r\n");
      out.write("      <td>City</td>\r\n");
      out.write("      <td>State</td>\r\n");
      out.write("      <td>Pincode</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${student.permanentAddress.street}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("      <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${student.permanentAddress.city}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("      <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${student.permanentAddress.state}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("      <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${student.permanentAddress.pincode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td>Medium of Examination*</td>\r\n");
      out.write("      <td colspan=\"4\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${student.mediumOfExamination.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td>Enrollment Number*</td>\r\n");
      out.write("      <td colspan=\"4\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${student.enrollmentNumber}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td>Belong to  S.C/S.T/O.B.C*</td>\r\n");
      out.write("      <td colspan=\"4\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${student.quotaFlag.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td>Were you ever rustigated/  expelled/ disqualified/ debarred from appearing at the examination?*</td>\r\n");
      out.write("      <td colspan=\"4\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${student.disqualifiedFlag.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("  </table>\r\n");
      out.write("  <p>&nbsp;</p>\r\n");
      out.write("</div>\r\n");
      out.write("<p align=\"center\">&nbsp;</p>\r\n");
      out.write("<div align=\"center\">\r\n");
      out.write("  <table width=\"870\" border=\"1\">\r\n");
      out.write("    <tr>\r\n");
      out.write("      <th width=\"210\" rowspan=\"2\" scope=\"col\">Details for point 19 rustigated/expelled/disqualified/debarred from appearing at the examination?</th>\r\n");
      out.write("      <th width=\"105\" scope=\"col\">University/Board</th>\r\n");
      out.write("      <th width=\"87\" scope=\"col\">Examination</th>\r\n");
      out.write("      <th width=\"115\" scope=\"col\">Year</th>\r\n");
      out.write("      <th width=\"116\" scope=\"col\">Enrollment No.</th>\r\n");
      out.write("      <th width=\"115\" scope=\"col\">Roll No.</th>\r\n");
      out.write("      <th width=\"76\" scope=\"col\">Period of punishment</th>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td height=\"49\"><p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${student.disqualifiedDescription.previousUniversityBoardName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</p></td>\r\n");
      out.write("      <td><p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${student.disqualifiedDescription.previousExaminationName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</p></td>\r\n");
      out.write("      <td><p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${student.disqualifiedDescription.previousYear}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</p></td>\r\n");
      out.write("      <td><p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${student.disqualifiedDescription.previousEnrollmentNumber}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</p></td>\r\n");
      out.write("      <td><p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${student.disqualifiedDescription.previousRollNumber}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</p></td>\r\n");
      out.write("      <td><p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${student.disqualifiedDescription.periodOfPunishment}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</p></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  </table>\r\n");
      out.write("  <p>&nbsp;</p>\r\n");
      out.write("</div>\r\n");
      out.write("    \r\n");
      out.write("\t<a href=\"adminHome\">Back to Home</a>|\r\n");
      out.write("\t<a href=\"student?id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${student.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("&edit\">Edit Student</a>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

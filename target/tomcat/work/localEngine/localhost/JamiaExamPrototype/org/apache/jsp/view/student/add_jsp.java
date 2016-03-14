package org.apache.jsp.view.student;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Add Student</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<h1>Add Student</h1>\r\n");
      out.write("\t\r\n");
      out.write("<form action=\"student\" method=\"post\">\r\n");
      out.write("\t<div align=\"center\">\r\n");
      out.write("\t  <input type=\"hidden\" name=\"add\">\r\n");
      out.write("\t  \r\n");
      out.write("\t  <table width=\"823\" border=\"1\">\r\n");
      out.write("\t    <tr>\r\n");
      out.write("\t      <th colspan=\"5\" scope=\"col\">Student Details</th>\r\n");
      out.write("        </tr>\r\n");
      out.write("\t    <tr>\r\n");
      out.write("\t      <td>Examination*</td>\r\n");
      out.write("\t      <td colspan=\"4\">\r\n");
      out.write("\t        <select name=\"examination_name\">\r\n");
      out.write("\t          <option value=\"0\">(none)</option>\r\n");
      out.write("\t          ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\t\t\t\r\n");
      out.write("            </select>\r\n");
      out.write("          </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("\t    <tr>\r\n");
      out.write("\t      <td>Year*</td>\r\n");
      out.write("\t      <td colspan=\"4\"><input name=\"year\" type=\"text\"></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("\t    <tr>\r\n");
      out.write("\t      <td>Part/Semester*</td>\r\n");
      out.write("\t      <td colspan=\"4\">\r\n");
      out.write("\t        <select name=\"semester_name\">\r\n");
      out.write("\t          <option value=\"0\">(none)</option>\r\n");
      out.write("\t          ");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write("\t\t\t\r\n");
      out.write("\t          </select>\t\r\n");
      out.write("\t        </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("\t    <tr>\r\n");
      out.write("\t      <td width=\"213\">Name*</td>\r\n");
      out.write("\t      <td colspan=\"4\"><input type=\"text\" name=\"name\"></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("\t    <tr>\r\n");
      out.write("\t      <td>Date of Birth*</td>\r\n");
      out.write("\t      <td colspan=\"4\"><input type=\"text\" name=\"date_of_birth\">(yyyy/mm/dd)</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("\t    <tr>\r\n");
      out.write("\t      <td rowspan=\"2\">Place of Birth*</td>\r\n");
      out.write("\t      <td width=\"144\">Town*</td>\r\n");
      out.write("\t      <td width=\"144\">Distt.*</td>\r\n");
      out.write("\t      <td colspan=\"2\">State*</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("\t    <tr>\r\n");
      out.write("\t      <td><input type=\"text\" name=\"DOB_town\"></td>\r\n");
      out.write("\t      <td><input type=\"text\" name=\"DOB_distt\"></td>\r\n");
      out.write("\t      <td colspan=\"2\"><input type=\"text\" name=\"DOB_state\"></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("\t    <tr>\r\n");
      out.write("\t      <td>Email Address*</td>\r\n");
      out.write("\t      <td colspan=\"4\"><input type=\"text\" name=\"email_address\"></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("\t    <tr>\r\n");
      out.write("\t      <td>Nationality*</td>\r\n");
      out.write("\t      <td colspan=\"4\"><input type=\"text\" name=\"nationality\"></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("\t    <tr>\r\n");
      out.write("\t      <td>Religion*</td>\r\n");
      out.write("\t      <td colspan=\"4\"><input type=\"text\" name=\"religion\"></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("\t    <tr>\r\n");
      out.write("\t      <td>Gender*</td>\r\n");
      out.write("\t      <td colspan=\"4\">\r\n");
      out.write("\t        <select name=\"gender\">\r\n");
      out.write("\t          <option value=\"0\">(none)</option>\r\n");
      out.write("\t          ");
      if (_jspx_meth_c_005fforEach_005f2(_jspx_page_context))
        return;
      out.write("\t\t\t\r\n");
      out.write("            </select></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("\t    <tr>\r\n");
      out.write("\t      <td>Father's Name*</td>\r\n");
      out.write("\t      <td colspan=\"4\"><input type=\"text\" name=\"father_name\"></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("\t    <tr>\r\n");
      out.write("\t      <td>Mother's Name*</td>\r\n");
      out.write("\t      <td colspan=\"4\"><input type=\"text\" name=\"mother_name\"></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("\t    <tr>\r\n");
      out.write("\t      <td>Spouse's Name*</td>\r\n");
      out.write("\t      <td colspan=\"4\"><input type=\"text\" name=\"spouse_name\"></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("         <tr>\r\n");
      out.write("\t      <td>Mobile Number*</td>\r\n");
      out.write("\t      <td colspan=\"4\"><input type=\"text\" name=\"mobile_number\"></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("\t    <tr>\r\n");
      out.write("\t      <td rowspan=\"2\">Correspondence Address*</td>\r\n");
      out.write("\t      <td>Street</td>\r\n");
      out.write("\t      <td>City</td>\r\n");
      out.write("\t      <td width=\"144\">State</td>\r\n");
      out.write("\t      <td width=\"144\">Pincode</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("\t    <tr>\r\n");
      out.write("\t      <td><input type=\"text\" name=\"correspondence_street\"></td>\r\n");
      out.write("\t      <td><input type=\"text\" name=\"correspondence_city\"></td>\r\n");
      out.write("\t      <td><input type=\"text\" name=\"correspondence_state\"></td>\r\n");
      out.write("\t      <td><input type=\"text\" name=\"correspondence_pincode\"></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("\t    <tr>\r\n");
      out.write("\t      <td rowspan=\"2\">Permanent Address*</td>\r\n");
      out.write("\t      <td>Street</td>\r\n");
      out.write("\t      <td>City</td>\r\n");
      out.write("\t      <td>State</td>\r\n");
      out.write("\t      <td>Pincode</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("\t    <tr>\r\n");
      out.write("\t      <td><input type=\"text\" name=\"permanent_street\"></td>\r\n");
      out.write("\t      <td><input type=\"text\" name=\"permanent_city\"></td>\r\n");
      out.write("\t      <td><input type=\"text\" name=\"permanent_state\"></td>\r\n");
      out.write("\t      <td><input type=\"text\" name=\"permanent_pincode\"></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("\t    <tr>\r\n");
      out.write("\t      <td>Medium of Examination*</td>\r\n");
      out.write("\t      <td colspan=\"4\">\r\n");
      out.write("\t        <select name=\"medium_of_examination\">\r\n");
      out.write("\t          <option value=\"0\">(none)</option>\r\n");
      out.write("\t          ");
      if (_jspx_meth_c_005fforEach_005f3(_jspx_page_context))
        return;
      out.write("\t\t\t\r\n");
      out.write("\t          </select>\r\n");
      out.write("          </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("\t    <tr>\r\n");
      out.write("\t      <td>Enrollment Number*</td>\r\n");
      out.write("\t      <td colspan=\"4\"><input type=\"text\" name=\"enrollment_number\"></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("\t    <tr>\r\n");
      out.write("\t      <td>Belong to  S.C/S.T/O.B.C*</td>\r\n");
      out.write("\t      <td colspan=\"4\"><select name=\"belong_to_SC_ST_OBC\">\r\n");
      out.write("\t        <option value=\"0\">(none)</option>\r\n");
      out.write("\t        ");
      if (_jspx_meth_c_005fforEach_005f4(_jspx_page_context))
        return;
      out.write("\t\t\t\r\n");
      out.write("\t        </select></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("      </table>\r\n");
      out.write("  </div>\r\n");
      out.write("  <p align=\"left\"><strong>\tBelow Details are to be entered by Student.</strong></p>\r\n");
      out.write("  <div align=\"center\">\r\n");
      out.write("    <table width=\"835\" border=\"1\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <th width=\"656\" scope=\"col\">Were you ever rustigated/  expelled/ disqualified/ debarred from appearing at the examination?</th>\r\n");
      out.write("        <th width=\"163\" scope=\"col\">\r\n");
      out.write("          <select name=\"rusticted_expelled_disqualified_debarred_flag\">\r\n");
      out.write("              <option value=\"0\">(none)</option>\r\n");
      out.write("              ");
      if (_jspx_meth_c_005fforEach_005f5(_jspx_page_context))
        return;
      out.write("\t\t\t\r\n");
      out.write("          </select>\t\r\n");
      out.write("          </th>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("  </div>\r\n");
      out.write("  <p align=\"center\">&nbsp;</p>\r\n");
      out.write("  <div align=\"center\">\r\n");
      out.write("    <table height=\"100\" border=\"1\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"152\" rowspan=\"2\"><strong>Details for above point</strong></td>\r\n");
      out.write("        <td width=\"144\"><strong>University/Board</strong></td>\r\n");
      out.write("        <td width=\"144\"><strong>Examination</strong></td>\r\n");
      out.write("        <td width=\"144\"><strong>Year</strong></td>\r\n");
      out.write("        <td width=\"144\"><strong>Enrollment No.</strong></td>\r\n");
      out.write("        <td width=\"144\"><strong>Roll No.</strong></td>\r\n");
      out.write("        <td width=\"140\"><strong>Period of punishment</strong></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td><input type=\"text\" name=\"previous_university_board\"></td>\r\n");
      out.write("        <td><input type=\"text\" name=\"previous_examination\"></td>\r\n");
      out.write("        <td><input type=\"text\" name=\"previous_year\"></td>\r\n");
      out.write("        <td><input type=\"text\" name=\"previous_enrollment_number\"></td>\r\n");
      out.write("        <td><input type=\"text\" name=\"previous_roll_number\"></td>\r\n");
      out.write("        <td><input type=\"text\" name=\"period_of_punishment\"></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("  </div>\r\n");
      out.write("  <p align=\"center\">\r\n");
      out.write("    <input type=\"submit\" name=\"add\" value=\"Submit\"/>\r\n");
      out.write("</p>\r\n");
      out.write("</form>\r\n");
      out.write("<a href=\"adminHome\">Back to Home</a>    \r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /view/student/add.jsp(27,11) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("examination_name");
    // /view/student/add.jsp(27,11) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/view/student/add.jsp(27,11) '${examination_names}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${examination_names}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t            <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${examination_name.value}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${examination_name.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
          out.write("\t            ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent(null);
    // /view/student/add.jsp(42,11) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVar("semester");
    // /view/student/add.jsp(42,11) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/view/student/add.jsp(42,11) '${semesters}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${semesters}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t            <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${semester.value}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${semester.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
          out.write("\t            ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f1.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f2.setParent(null);
    // /view/student/add.jsp(84,11) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f2.setVar("gender");
    // /view/student/add.jsp(84,11) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f2.setItems(new org.apache.jasper.el.JspValueExpression("/view/student/add.jsp(84,11) '${genders}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${genders}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f2 = _jspx_th_c_005fforEach_005f2.doStartTag();
      if (_jspx_eval_c_005fforEach_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t            <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${gender.value}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${gender.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
          out.write("\t            ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f2.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f3.setParent(null);
    // /view/student/add.jsp(136,11) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f3.setVar("medium_of_examination");
    // /view/student/add.jsp(136,11) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f3.setItems(new org.apache.jasper.el.JspValueExpression("/view/student/add.jsp(136,11) '${medium_of_examinations}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${medium_of_examinations}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f3 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f3 = _jspx_th_c_005fforEach_005f3.doStartTag();
      if (_jspx_eval_c_005fforEach_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t            <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${medium_of_examination.value}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${medium_of_examination.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
          out.write("\t            ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f3.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f3);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f4 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f4.setParent(null);
    // /view/student/add.jsp(150,9) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f4.setVar("flag");
    // /view/student/add.jsp(150,9) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f4.setItems(new org.apache.jasper.el.JspValueExpression("/view/student/add.jsp(150,9) '${flags}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${flags}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f4 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f4 = _jspx_th_c_005fforEach_005f4.doStartTag();
      if (_jspx_eval_c_005fforEach_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t          <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${flag.value}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${flag.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
          out.write("\t          ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f4.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f4);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f5 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f5.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f5.setParent(null);
    // /view/student/add.jsp(165,14) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f5.setVar("flag");
    // /view/student/add.jsp(165,14) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f5.setItems(new org.apache.jasper.el.JspValueExpression("/view/student/add.jsp(165,14) '${flags}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${flags}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f5 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f5 = _jspx_th_c_005fforEach_005f5.doStartTag();
      if (_jspx_eval_c_005fforEach_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${flag.value}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${flag.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f5.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f5.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f5);
    }
    return false;
  }
}

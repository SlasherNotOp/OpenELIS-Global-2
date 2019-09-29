package org.openelisglobal.reportconfiguration.controller;

import org.openelisglobal.common.controller.BaseController;
import org.openelisglobal.common.services.DisplayListService;
import org.openelisglobal.reportconfiguration.form.ReportConfigurationForm;
import org.openelisglobal.reportconfiguration.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.InvocationTargetException;

@Controller
public class ReportConfigurationController extends BaseController {

    @Autowired
    private ReportService reportService;

    @RequestMapping(value = "/ReportConfiguration", method = RequestMethod.GET)
    public ModelAndView showReports(HttpServletRequest request)
            throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        ReportConfigurationForm form = new ReportConfigurationForm();
        form.setCategories(DisplayListService.getInstance().getList(DisplayListService.ListType.REPORT_CATEGORY));
        form.setTypes(DisplayListService.getInstance().getList(DisplayListService.ListType.REPORT_TYPE));
        form.setReportList(reportService.getAll());
        return findForward(FWD_SUCCESS, form);
    }


    @RequestMapping(value = "/ReportConfiguration", method = RequestMethod.POST)
    public ModelAndView editReports(HttpServletRequest request, @ModelAttribute("form") ReportConfigurationForm form,
                                    BindingResult result, RedirectAttributes redirectAttributes)
            throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {

        boolean updated = false;// reportService.update(form);
        if (updated) {
            return findForward(FWD_SUCCESS_INSERT, form);
        } else {
            return findForward(FWD_FAIL_INSERT, form);
        }
    }

    @Override
    protected String findLocalForward(String forward) {
        if (FWD_SUCCESS.equals(forward)) {
            return "ReportManagementDefinition";
        } else if (FWD_FAIL.equals(forward)) {
            return "ReportManagementDefinition";
        } else {
            return "PageNotFound";
        }
    }

    @Override
    protected String getPageSubtitleKey() {
        return "banner.menu.reportManagements";
    }

    @Override
    protected String getPageTitleKey() {
        return "banner.menu.reportManagement";
    }
}

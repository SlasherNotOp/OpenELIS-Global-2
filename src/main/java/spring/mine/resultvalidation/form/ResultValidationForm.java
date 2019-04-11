package spring.mine.resultvalidation.form;

import java.sql.Timestamp;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import spring.mine.common.form.BaseForm;
import spring.mine.common.validator.ValidationHelper;
import spring.mine.validation.annotations.ValidDate;
import us.mn.state.health.lims.common.paging.PagingBean;
import us.mn.state.health.lims.common.util.IdValuePair;
import us.mn.state.health.lims.common.util.validator.CustomDateValidator.DateRelation;
import us.mn.state.health.lims.resultvalidation.bean.AnalysisItem;

public class ResultValidationForm extends BaseForm {
	// for display
	private PagingBean paging;

	private Timestamp lastupdated;

	@ValidDate(relative = DateRelation.TODAY)
	private String currentDate = "";

	// TODO
	@Valid
	private List<AnalysisItem> resultList;

	// for display
	private String testSection = "";

	// for display
	private String testName = "";

	// for display
	private List<IdValuePair> testSections;

	// for display
	private List<IdValuePair> testSectionsByName;

	@NotBlank
	@Pattern(regexp = ValidationHelper.ID_REGEX)
	private String testSectionId;

	private Boolean displayTestSections = true;

	public ResultValidationForm() {
		setFormName("ResultValidationForm");
	}

	public PagingBean getPaging() {
		return paging;
	}

	public void setPaging(PagingBean paging) {
		this.paging = paging;
	}

	public Timestamp getLastupdated() {
		return lastupdated;
	}

	public void setLastupdated(Timestamp lastupdated) {
		this.lastupdated = lastupdated;
	}

	public String getCurrentDate() {
		return currentDate;
	}

	public void setCurrentDate(String currentDate) {
		this.currentDate = currentDate;
	}

	public List<AnalysisItem> getResultList() {
		return resultList;
	}

	public void setResultList(List<AnalysisItem> resultList) {
		this.resultList = resultList;
	}

	public String getTestSection() {
		return testSection;
	}

	public void setTestSection(String testSection) {
		this.testSection = testSection;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	public List<IdValuePair> getTestSections() {
		return testSections;
	}

	public void setTestSections(List<IdValuePair> testSections) {
		this.testSections = testSections;
	}

	public List<IdValuePair> getTestSectionsByName() {
		return testSectionsByName;
	}

	public void setTestSectionsByName(List<IdValuePair> testSectionsByName) {
		this.testSectionsByName = testSectionsByName;
	}

	public String getTestSectionId() {
		return testSectionId;
	}

	public void setTestSectionId(String testSectionId) {
		this.testSectionId = testSectionId;
	}

	public Boolean getDisplayTestSections() {
		return displayTestSections;
	}

	public void setDisplayTestSections(Boolean displayTestSections) {
		this.displayTestSections = displayTestSections;
	}
}

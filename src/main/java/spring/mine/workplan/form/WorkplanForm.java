package spring.mine.workplan.form;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.SafeHtml;

import spring.mine.common.form.BaseForm;
import spring.mine.common.validator.ValidationHelper;
import spring.mine.validation.annotations.ValidDate;
import us.mn.state.health.lims.common.util.IdValuePair;
import us.mn.state.health.lims.common.util.validator.CustomDateValidator.DateRelation;
import us.mn.state.health.lims.resultvalidation.bean.AnalysisItem;
import us.mn.state.health.lims.test.beanItems.TestResultItem;

public class WorkplanForm extends BaseForm {
	@ValidDate(relative = DateRelation.TODAY)
	private String currentDate = "";

	// for display
	private String searchLabel;

	// for display
	private List<IdValuePair> searchTypes;

	@Pattern(regexp = ValidationHelper.ID_REGEX)
	private String selectedSearchID = "";

	@Pattern(regexp = ValidationHelper.ID_REGEX)
	private String testTypeID = "";

	@SafeHtml
	private String testName = "";

	@NotNull
	private Boolean searchFinished = false;

	// TODO
	@Valid
	private List<TestResultItem> workplanTests;

	// TODO
	@Valid
	private List<AnalysisItem> resultList;

	@Pattern(regexp = "^$|^test$|^panel$")
	private String workplanType = "";

	@NotBlank
	@Pattern(regexp = "^$|^WorkPlanByPanel.do$|^WorkPlanByTest.do$")
	private String searchAction = "";

	// for display
	private List<IdValuePair> testSections;

	// for display
	private List<IdValuePair> testSectionsByName;

	@Pattern(regexp = ValidationHelper.ID_REGEX)
	private String testSectionId;

	public WorkplanForm() {
		setFormName("WorkplanForm");
	}

	public String getCurrentDate() {
		return currentDate;
	}

	public void setCurrentDate(String currentDate) {
		this.currentDate = currentDate;
	}

	public String getSearchLabel() {
		return searchLabel;
	}

	public void setSearchLabel(String searchLabel) {
		this.searchLabel = searchLabel;
	}

	public List<IdValuePair> getSearchTypes() {
		return searchTypes;
	}

	public void setSearchTypes(List<IdValuePair> searchTypes) {
		this.searchTypes = searchTypes;
	}

	public String getSelectedSearchID() {
		return selectedSearchID;
	}

	public void setSelectedSearchID(String selectedSearchID) {
		this.selectedSearchID = selectedSearchID;
	}

	public String getTestTypeID() {
		return testTypeID;
	}

	public void setTestTypeID(String testTypeID) {
		this.testTypeID = testTypeID;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	public Boolean getSearchFinished() {
		return searchFinished;
	}

	public void setSearchFinished(Boolean searchFinished) {
		this.searchFinished = searchFinished;
	}

	public List<TestResultItem> getWorkplanTests() {
		return workplanTests;
	}

	public void setWorkplanTests(List<TestResultItem> workplanTests) {
		this.workplanTests = workplanTests;
	}

	public List<AnalysisItem> getResultList() {
		return resultList;
	}

	public void setResultList(List<AnalysisItem> resultList) {
		this.resultList = resultList;
	}

	public String getWorkplanType() {
		return workplanType;
	}

	public void setWorkplanType(String workplanType) {
		this.workplanType = workplanType;
	}

	public String getSearchAction() {
		return searchAction;
	}

	public void setSearchAction(String searchAction) {
		this.searchAction = searchAction;
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
}

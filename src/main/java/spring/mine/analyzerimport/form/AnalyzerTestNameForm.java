package spring.mine.analyzerimport.form;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.SafeHtml;

import spring.mine.common.form.BaseForm;
import spring.mine.common.validator.ValidationHelper;
import us.mn.state.health.lims.analyzer.valueholder.Analyzer;
import us.mn.state.health.lims.test.valueholder.Test;

public class AnalyzerTestNameForm extends BaseForm {

	// for display
	private List<Analyzer> analyzerList;

	// for display
	private List<Test> testList;

	@NotBlank
	@Pattern(regexp = ValidationHelper.ID_REGEX)
	private String analyzerId;

	@NotBlank
	@Pattern(regexp = ValidationHelper.ID_REGEX)
	private String testId;

	@NotBlank
	@SafeHtml
	private String analyzerTestName;

	private boolean newMapping = true;

	public AnalyzerTestNameForm() {
		setFormName("analyzerTestNameForm");
	}

	public List<Analyzer> getAnalyzerList() {
		return analyzerList;
	}

	public void setAnalyzerList(List<Analyzer> analyzerList) {
		this.analyzerList = analyzerList;
	}

	public String getAnalyzerId() {
		return analyzerId;
	}

	public void setAnalyzerId(String analyzerId) {
		this.analyzerId = analyzerId;
	}

	public List<Test> getTestList() {
		return testList;
	}

	public void setTestList(List<Test> testList) {
		this.testList = testList;
	}

	public String getTestId() {
		return testId;
	}

	public void setTestId(String testId) {
		this.testId = testId;
	}

	public String getAnalyzerTestName() {
		return analyzerTestName;
	}

	public void setAnalyzerTestName(String analyzerTestName) {
		this.analyzerTestName = analyzerTestName;
	}

	public boolean isNewMapping() {
		return newMapping;
	}

	public void setNewMapping(boolean newMapping) {
		this.newMapping = newMapping;
	}
}

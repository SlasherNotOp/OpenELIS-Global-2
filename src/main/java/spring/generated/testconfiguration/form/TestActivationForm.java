package spring.generated.testconfiguration.form;

import java.util.List;

import spring.mine.common.form.BaseForm;
import us.mn.state.health.lims.test.beanItems.TestActivationBean;

public class TestActivationForm extends BaseForm {
	// for display
	private List<TestActivationBean> activeTestList;

	// for display
	private List<TestActivationBean> inactiveTestList;

	// TODO
	private String jsonChangeList = "";

	public TestActivationForm() {
		setFormName("testActivationForm");
	}

	public List<TestActivationBean> getActiveTestList() {
		return activeTestList;
	}

	public void setActiveTestList(List<TestActivationBean> activeTestList) {
		this.activeTestList = activeTestList;
	}

	public List<TestActivationBean> getInactiveTestList() {
		return inactiveTestList;
	}

	public void setInactiveTestList(List<TestActivationBean> inactiveTestList) {
		this.inactiveTestList = inactiveTestList;
	}

	public String getJsonChangeList() {
		return jsonChangeList;
	}

	public void setJsonChangeList(String jsonChangeList) {
		this.jsonChangeList = jsonChangeList;
	}
}

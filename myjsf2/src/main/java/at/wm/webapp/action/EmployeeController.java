package at.wm.webapp.action;

import java.io.Serializable;

import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.springframework.stereotype.Component;

@ViewScoped
@Component
public class EmployeeController extends BasePage implements Serializable {

	private static final long serialVersionUID = 6629483801771322695L;

	@ManagedProperty("#{param.id}")
	private Long id = 1l;

	private Long notaryId;

	public Long getNotaryId() {
		log.debug("get notaryId: " + notaryId);
		return notaryId;
	}

	public void setNotaryId(Long notaryId) {
		log.debug("set notaryId: " + notaryId);
		this.notaryId = notaryId;
	}

	public Long getId() {
		log.debug("get id: " + id);
		return id;
	}

	public void setId(Long id) {
		log.debug("set id: " + id);
		this.id = id;
	}

	public void actionLoad(Long id, Long notaryId) {
		log.debug(String.format("load data by id: %s, notaryId: %s ///", id, notaryId));
	}
}
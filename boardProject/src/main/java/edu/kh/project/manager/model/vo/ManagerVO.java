package edu.kh.project.manager.model.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class ManagerVO {
	private int managerNumber;
	private String managerName;
	private String managerHireDate;
}

package edu.kh.project.student.model.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class StudentVO {
	private int studentNumber;
	private String studentName;
	private int koreanScore;
	private int englishScore;
	private int mathScore;
}

package com.web.Service;
	import java.util.List;

import com.web.Entity.StudentEntity;

	public interface StudentService {

		public StudentEntity saveStudent(StudentEntity student);
		public StudentEntity updateAllStudents(StudentEntity student);
		public void deleteStudentRecord(int studentRollNumber);
		public StudentEntity getOneStudentRecord(int studentRollNumber);
		public List<StudentEntity> getAllStudentRecord();
		
	}



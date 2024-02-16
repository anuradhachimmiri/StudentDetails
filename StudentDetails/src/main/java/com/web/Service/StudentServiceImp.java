package com.web.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.Entity.StudentEntity;
import com.web.Repo.StudentRepo;
@Service
public class StudentServiceImp implements StudentService {
	@Autowired
	private StudentRepo repo;

	@Override
	public StudentEntity saveStudent(StudentEntity student) {
		int total = 0;
		float percentage = 0;
		String grade = null, result = null;
		total = student.getHibernateMarks() + student.getSpringMarks() + student.getSpringBootMarks();
		percentage = total / 3;
		
		if(percentage >= 75)
		{
			grade = "A Grade";
		}
		else if(percentage >= 65)
		{
			grade = "B Grade";
		}
		else if(percentage >= 50)
		{
			grade = "C Grade";
		}
		else
		{
			grade = "D Grade";
		}
		
		if(student.getHibernateMarks()>= 35 && student.getSpringMarks()>= 35 && student.getSpringBootMarks()>= 35)
		{
			result = "Pass";
		}
		else
		{
			result = "Fail";
		}
		student.setTotalMarks(total);
		student.setPercentage(percentage);
		student.setGrade(grade);
		student.setResult(result);
		StudentEntity save = repo.save(student);
		return save;
	}

	@Override
	public StudentEntity updateAllStudents(StudentEntity student) {
		int total = 0;
		float percentage = 0;
		String grade = null, result = null;
		total = student.getHibernateMarks() + student.getSpringMarks() + student.getSpringBootMarks();
		percentage = total / 3;
		
		if(percentage >= 75)
		{
			grade = "A Grade";
		}
		else if(percentage >= 65)
		{
			grade = "B Grade";
		}
		else if(percentage >= 50)
		{
			grade = "C Grade";
		}
		else
		{
			grade = "D Grade";
		}
		
		if(student.getHibernateMarks()>= 35 && student.getSpringMarks()>= 35 && student.getSpringBootMarks()>= 35)
		{
			result = "Pass";
		}
		else
		{
			result = "Fail";
		}
		student.setTotalMarks(total);
		student.setPercentage(percentage);
		student.setGrade(grade);
		student.setResult(result);
		StudentEntity save = repo.save(student);
		return save;
		
	}

	@Override
	public void deleteStudentRecord(int studentRollNumber) {
		repo.deleteById(studentRollNumber);

	}

	@Override
	public StudentEntity getOneStudentRecord(int studentRollNumber) {
		StudentEntity get = repo.findById(studentRollNumber).get();
		return get;
	}

	@Override
	public List<StudentEntity> getAllStudentRecord() {
		List<StudentEntity> allStudents = (List<StudentEntity>) repo.findAll();
		return allStudents;
	}

}

		
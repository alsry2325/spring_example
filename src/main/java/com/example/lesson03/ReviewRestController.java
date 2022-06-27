package com.example.lesson03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson03.bo.ReviewBO;
import com.example.lesson03.model.Review;

@RestController
public class ReviewRestController {

	
	@Autowired
	private ReviewBO reviewBO;
	
		//localhost/lesson03/ex01
		//localhost/lesson03/ex01?id=4   //쿼리파라미터 &해서 여러개 붙일수있다
	@RequestMapping("/lesson03/ex01")
	public Review ex01(
//			@RequestParam(value = "id")int id //필수 파라미터
//			@RequestParam("id") int id //필수 파라미터
//			@RequestParam(value="id", required = true)int id //필수 파라미터
//			@RequestParam(value="id",required = false) Integer id //비필수 파라미터
			@RequestParam(value = "id", defaultValue = "1") int id // 비필수 파라미터, 디폴트값은 1
			) {
		System.out.println("#####id="+id);
		return reviewBO.getReview(id);
	}
	
			//localhost/lesson03/ex02
	@RequestMapping("/lesson03/ex02")
	public String ex02() {
		Review review = new Review();
		
		review.setStoreName("배달삼겹");
		review.setMenu("삼겹혼밥세트");
		review.setUserName("정민교");
		review.setPoint(4.5);
		review.setReview("혼자머어아긱");
		 
		 int row = reviewBO.addReview(review); //insert 된 row 수를 리턴 받는다.
		 
		 return  row > 0 ? row+"행 성공":"실패";
				 
		 
		
	}
	
	//localhost/lesson03/ex02/2
	@RequestMapping("/lesson03/ex02/2")
	public String ex02_2() {
		 int row = reviewBO.addReviewAsField("도미노피자","콤비네이션R","바다",5.0,"역시 맛있다!");
		
		
		return row + "입력성공";
	}
	
	//localhost/lesson03/ex03?id=23&review=도미노피자는 역시맛있어~~
	@RequestMapping("/lesson03/ex03")
	public String ex03(
			
			@RequestParam("id") int id,
			@RequestParam("review") String review) {
		
		int row =	reviewBO.updateReviewById(id,review);
		
		return row +"변경완료";
	}
	
	
}

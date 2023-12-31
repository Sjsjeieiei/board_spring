package com.myboot03.member.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.myboot03.member.vo.MemberVO;




@Mapper
@Repository("memberDAO")
public interface MemberDAO {
	
	public List<MemberVO> selectAllMembers() throws DataAccessException ;

	
	
	public void addMember(MemberVO memberVO) throws DataAccessException ;
	
	
	
	public void delMember(String id) throws DataAccessException ;
	
	
	public void updateArticle(Map articleMap) throws DataAccessException;
	
	
	public MemberVO searchMemberbyID(String id) throws DataAccessException ;
		
	
	public void updateMember(MemberVO memberVO) throws DataAccessException ; 
	
	
	public List<MemberVO>  searchMemberbyName(String memberName) throws DataAccessException;
	
	public List<MemberVO> selectMemberByNameOrEmail(String nameOrEmail) throws DataAccessException;
	
	public MemberVO loginById(MemberVO memberVO) throws DataAccessException;
	
}

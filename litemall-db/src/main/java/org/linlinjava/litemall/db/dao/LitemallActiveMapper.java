package org.linlinjava.litemall.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.linlinjava.litemall.db.domain.LitemallActive;
import org.linlinjava.litemall.db.domain.LitemallActiveExample;

public interface LitemallActiveMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_active
     *
     * @mbg.generated
     */
    long countByExample(LitemallActiveExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_active
     *
     * @mbg.generated
     */
    int deleteByExample(LitemallActiveExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_active
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_active
     *
     * @mbg.generated
     */
    int insert(LitemallActive record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_active
     *
     * @mbg.generated
     */
    int insertSelective(LitemallActive record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_active
     *
     * @mbg.generated
     */
    LitemallActive selectOneByExample(LitemallActiveExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_active
     *
     * @mbg.generated
     */
    LitemallActive selectOneByExampleSelective(@Param("example") LitemallActiveExample example, @Param("selective") LitemallActive.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_active
     *
     * @mbg.generated
     */
    List<LitemallActive> selectByExampleSelective(@Param("example") LitemallActiveExample example, @Param("selective") LitemallActive.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_active
     *
     * @mbg.generated
     */
    List<LitemallActive> selectByExample(LitemallActiveExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_active
     *
     * @mbg.generated
     */
    LitemallActive selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") LitemallActive.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_active
     *
     * @mbg.generated
     */
    LitemallActive selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_active
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") LitemallActive record, @Param("example") LitemallActiveExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_active
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") LitemallActive record, @Param("example") LitemallActiveExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_active
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(LitemallActive record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_active
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(LitemallActive record);
}
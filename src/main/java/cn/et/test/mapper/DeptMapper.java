package cn.et.test.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;

import cn.et.test.entity.Dept;
import cn.et.test.entity.DeptExample;
@Mapper//集成到SpringBoot中需要添加该注解 ,表示这是一个映射接口
public interface DeptMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept
     *
     * @mbg.generated Fri Dec 15 21:28:05 CST 2017
     */
    @SelectProvider(type=DeptSqlProvider.class, method="countByExample")
    long countByExample(DeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept
     *
     * @mbg.generated Fri Dec 15 21:28:05 CST 2017
     */
    @DeleteProvider(type=DeptSqlProvider.class, method="deleteByExample")
    int deleteByExample(DeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept
     *
     * @mbg.generated Fri Dec 15 21:28:05 CST 2017
     */
    @Delete({
        "delete from dept",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept
     *
     * @mbg.generated Fri Dec 15 21:28:05 CST 2017
     */
    @Insert({
        "insert into dept (id, dName, ",
        "pId)",
        "values (#{id,jdbcType=INTEGER}, #{dname,jdbcType=VARCHAR}, ",
        "#{pid,jdbcType=INTEGER})"
    })
    int insert(Dept record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept
     *
     * @mbg.generated Fri Dec 15 21:28:05 CST 2017
     */
    @InsertProvider(type=DeptSqlProvider.class, method="insertSelective")
    int insertSelective(Dept record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept
     *
     * @mbg.generated Fri Dec 15 21:28:05 CST 2017
     */
    @SelectProvider(type=DeptSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="dName", property="dname", jdbcType=JdbcType.VARCHAR),
        @Result(column="pId", property="pid", jdbcType=JdbcType.INTEGER)
    })
    List<Dept> selectByExampleWithRowbounds(DeptExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept
     *
     * @mbg.generated Fri Dec 15 21:28:05 CST 2017
     */
    @SelectProvider(type=DeptSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="dName", property="dname", jdbcType=JdbcType.VARCHAR),
        @Result(column="pId", property="pid", jdbcType=JdbcType.INTEGER)
    })
    List<Dept> selectByExample(DeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept
     *
     * @mbg.generated Fri Dec 15 21:28:05 CST 2017
     */
    @Select({
        "select",
        "id, dName, pId",
        "from dept",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="dName", property="dname", jdbcType=JdbcType.VARCHAR),
        @Result(column="pId", property="pid", jdbcType=JdbcType.INTEGER)
    })
    Dept selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept
     *
     * @mbg.generated Fri Dec 15 21:28:05 CST 2017
     */
    @UpdateProvider(type=DeptSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Dept record, @Param("example") DeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept
     *
     * @mbg.generated Fri Dec 15 21:28:05 CST 2017
     */
    @UpdateProvider(type=DeptSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Dept record, @Param("example") DeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept
     *
     * @mbg.generated Fri Dec 15 21:28:05 CST 2017
     */
    @UpdateProvider(type=DeptSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Dept record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept
     *
     * @mbg.generated Fri Dec 15 21:28:05 CST 2017
     */
    @Update({
        "update dept",
        "set dName = #{dname,jdbcType=VARCHAR},",
          "pId = #{pid,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Dept record);
}
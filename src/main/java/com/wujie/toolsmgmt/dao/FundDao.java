package com.wujie.toolsmgmt.dao;

import com.wujie.toolsmgmt.model.RechargeSeq;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class FundDao {


    @Resource
    @Qualifier("primaryJdbcTemplate")
    JdbcTemplate newDeposit;

    @Resource
    @Qualifier("secondaryJdbcTemplate")
    JdbcTemplate onlineNoDeposit;

    @Resource
    @Qualifier("thirdJdbcTemplate")
    JdbcTemplate bakDeposit;



    public List getRecharegeListNewepositByUid(String uid){
        String sql = "select * from tzj_wallet.recharge twr where twr.uid=?";
        List list = newDeposit.queryForList(sql,new Object[]{uid});
        return list;
    }

    public Integer getRecharegeCountNewepositByUid(String uid){
        String sql = "select count(*) as count from tzj_wallet.recharge twr where twr.uid=?";
        Integer count = newDeposit.queryForObject(sql,new Object[]{uid},Integer.class);
        return count;
    }

    public Integer getRecharegeCountOldByUid(String uid){
        String sql = "select count(*) as count from tzj_wallet.recharge twr where twr.uid=?";
        Integer count = onlineNoDeposit.queryForObject(sql,new Object[]{uid},Integer.class);
        return count;
    }

    //��ȡ�´������ˮ
    public List<RechargeSeq> getRechargeSeqNewDepositByUid(String uid){
        String sql = "select se.create_at,se.id, se.after_amount, se.amount, se.`comment` from tzj_wallet.account_seq se where se.uid=?";
        return (List<RechargeSeq>)newDeposit.query(sql,new Object[]{uid}, new RowMapper<RechargeSeq>() {
            @Override
            public RechargeSeq mapRow(ResultSet rs, int rowNum) throws SQLException {
                RechargeSeq rechargeSeq = new RechargeSeq();
                rechargeSeq.setCreate_at(rs.getString("create_at"));
                rechargeSeq.setId(rs.getString("id"));
                rechargeSeq.setAfter_amount(rs.getString("after_amount"));
                rechargeSeq.setAmount(rs.getString("amount"));
                rechargeSeq.setComment(rs.getString("comment"));
                return rechargeSeq;
            }
        });
    }

    //��ȡ�Ǵ������ˮ
    public List<RechargeSeq> getRechargeSeqNodepositByUid(String uid){
        String sql = "select se.create_at,se.id, se.after_amount, se.amount, se.`comment` from tzj_wallet.account_seq se where se.uid=?";
        return (List<RechargeSeq>)onlineNoDeposit.query(sql,new Object[]{uid}, new RowMapper<RechargeSeq>() {
            @Override
            public RechargeSeq mapRow(ResultSet rs, int rowNum) throws SQLException {
                RechargeSeq rechargeSeq = new RechargeSeq();
                rechargeSeq.setCreate_at(rs.getString("create_at"));
                rechargeSeq.setId(rs.getString("id"));
                rechargeSeq.setAfter_amount(rs.getString("after_amount"));
                rechargeSeq.setAmount(rs.getString("amount"));
                rechargeSeq.setComment(rs.getString("comment"));
                return rechargeSeq;
            }
        });
    }
    //��ȡ���ݴ������ˮ
    public List<RechargeSeq> getRechargeSeqBakDepositByUid(String uid){
        String sql = "select se.create_at,se.id, se.after_amount, se.amount, se.`comment` from tzj_wallet_copy_test.account_seq se where se.uid=?";
        return (List<RechargeSeq>)bakDeposit.query(sql,new Object[]{uid}, new RowMapper<RechargeSeq>() {
            @Override
            public RechargeSeq mapRow(ResultSet rs, int rowNum) throws SQLException {
                RechargeSeq rechargeSeq = new RechargeSeq();
                rechargeSeq.setCreate_at(rs.getString("create_at"));
                rechargeSeq.setId(rs.getString("id"));
                rechargeSeq.setAfter_amount(rs.getString("after_amount"));
                rechargeSeq.setAmount(rs.getString("amount"));
                rechargeSeq.setComment(rs.getString("comment"));
                return rechargeSeq;
            }
        });
    }

    public List getNewDepositWalletUsers(){
        String sql = "select twa.uid from tzj_wallet.account twa where twa.uid NOT LIKE \"TZJ\\_%\" AND twa.uid NOT LIKE \"mall\\-%\" AND twa.uid NOT IN(\"majun\",\"hstrong\",\"strong\",\"h65Nl2ELI\",\"8uRqlVZZG0\",\"L3IlatzTil\",\"huoqibao\",\"HFp1K5KBZ\") limit 526,5000";
        return newDeposit.queryForList(sql,String.class);
    }

    public Integer getRechargeCountBakByUid(String uid){
        String sql = "select count(*) as count from tzj_wallet_copy_test.recharge twr where twr.uid=?";
        Integer count = bakDeposit.queryForObject(sql,new Object[]{uid},Integer.class);
        return count;
    }


    public List getOldDepositWalletUsers(){
        String sql = "select twa.uid from tzj_wallet_copy_test.account twa where twa.uid NOT LIKE \"TZJ\\_%\" AND twa.uid NOT LIKE \"mall\\-%\" AND twa.uid NOT IN(\"majun\",\"hstrong\",\"strong\",\"h65Nl2ELI\",\"8uRqlVZZG0\",\"L3IlatzTil\",\"huoqibao\",\"HFp1K5KBZ\")";
        List uidList = bakDeposit.queryForList(sql, String.class);
        return uidList;
    }

//    public JSONObject getAllRecharegeCountNewDeposit(){
//        String sql = "select twr.uid as uid, count(twr.uid) as count from tzj_wallet.recharge twr where twr.uid='8iOR3obQc'";
//        JSONObject list = (JSONObject)newDeposit.query(sql, new RowMapper<JSONObject>() {
//            @Override
//            public JSONObject mapRow(ResultSet rs, int rowNum) throws SQLException {
//                JSONObject jsonObject= new JSONObject();
//                    jsonObject.put(rs.getString("uid"),rs.getInt("count"));
//                return jsonObject;
//            }
//
//        });
//        //List map = newDeposit.queryForList(sql);
//        return jsonObject;
//    }

}

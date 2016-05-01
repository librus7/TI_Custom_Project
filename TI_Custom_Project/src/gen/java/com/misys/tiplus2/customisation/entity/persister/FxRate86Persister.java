package com.misys.tiplus2.customisation.entity.persister;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.misys.tiplus2.persistent.EntityPersister;
import com.misys.tiplus2.customisation.entity.FxRate86;
import com.misys.tiplus2.customisation.entity.FxRate86.Key_FxRate86;

@SuppressWarnings("unchecked")
public class FxRate86Persister extends EntityPersister {

	// This code will be generated by the builder 
	
	public FxRate86Persister() {
		setKeyMembers(new MemberDescriptor[] {
            new MemberDescriptor("branch", "FxRate86.BRANCH", getBinderFactory().getBinderForType("String")),
            new MemberDescriptor("code53", "FxRate86.CODE53", getBinderFactory().getBinderForType("String")),
            new MemberDescriptor("curren49", "FxRate86.CURREN49", getBinderFactory().getBinderForType("String")),
		});
			
		setMembers(new MemberDescriptor[] {
            new MemberDescriptor("typeflag", "FxRate86.TYPEFLAG", getBinderFactory().getBinderForType("Integer")),
            new MemberDescriptor("tstamp", "FxRate86.TSTAMP", getBinderFactory().getBinderForType("Integer")),
            new MemberDescriptor("buyexc03", "FxRate86.BUYEXC03", getBinderFactory().getBinderForType("BigDecimal")),
            new MemberDescriptor("buyperspd", "FxRate86.BUYPERSPD", getBinderFactory().getBinderForType("BigDecimal")),
            new MemberDescriptor("buyexby", "FxRate86.BUYEXBY", getBinderFactory().getBinderForType("String")),
            new MemberDescriptor("buyspr07", "FxRate86.BUYSPR07", getBinderFactory().getBinderForType("BigDecimal")),
            new MemberDescriptor("mnt_in_bo", "FxRate86.MNT_IN_BO", getBinderFactory().getBinderForType("String")),
            new MemberDescriptor("sellex99", "FxRate86.SELLEX99", getBinderFactory().getBinderForType("BigDecimal")),
            new MemberDescriptor("sellperspd", "FxRate86.SELLPERSPD", getBinderFactory().getBinderForType("BigDecimal")),
            new MemberDescriptor("sellexby", "FxRate86.SELLEXBY", getBinderFactory().getBinderForType("String")),
            new MemberDescriptor("sellsp03", "FxRate86.SELLSP03", getBinderFactory().getBinderForType("BigDecimal")),
		});

		setForeignKeyMappings(new ForeignKeyMappingDescriptor[] {
		});
	}

    private static final String tableName = "FxRate86";

    /**
     * Gets the table name - in this case FxRate86
     * <p>
     * Note that the <i>schema</i> must be prefixed to this when constructing
     * SQL statements, for example: <code>schema.FxRate86</code>
     * 
     * @return the table name
     */
	@Override
	public String getTableName() {       
		return tableName;
	}

	@Override
	public Class<?> getEntityClass() {
		return FxRate86.class;
	}

	public Class<?> getKeyClass() {
		return Key_FxRate86.class;
	}

	@Override
	public FxRate86 constructEntity(final Object[] keyValues, final Object[] resultRow) {
		final FxRate86 entity = new FxRate86();
		
		// Key members
		final Key_FxRate86 key = entity.get$key();
		assignKeyValues(key, keyValues);

		assignMemberValues(entity, resultRow);
		
		return entity;
	}
	
	@Override
	public Key_FxRate86 constructKey(final Object[] keyValues) {
		final Key_FxRate86 key = new Key_FxRate86();
		assignKeyValues(key, keyValues);
		return key;
	}
	
	@Override
	public void assignKeyValues(final Object object, final Object[] resultRow) {
		final Key_FxRate86 result = (Key_FxRate86)object;
		int index = 0;
		result.setBranch((java.lang.String)resultRow[index++]);
		result.setCode53((java.lang.String)resultRow[index++]);
		result.setCurren49((java.lang.String)resultRow[index++]);
	}
	
	@Override
	public void assignMemberValues(final Object object, final Object[] resultRow) {
		final FxRate86 result = (FxRate86)object;
		int index = 0;
		result.setTypeflag((java.lang.Integer)resultRow[index++]);
		result.setTstamp((java.lang.Integer)resultRow[index++]);
		result.setBuyexc03((java.math.BigDecimal)resultRow[index++]);
		result.setBuyperspd((java.math.BigDecimal)resultRow[index++]);
		result.setBuyexby((java.lang.String)resultRow[index++]);
		result.setBuyspr07((java.math.BigDecimal)resultRow[index++]);
		result.setMnt_in_bo((java.lang.String)resultRow[index++]);
		result.setSellex99((java.math.BigDecimal)resultRow[index++]);
		result.setSellperspd((java.math.BigDecimal)resultRow[index++]);
		result.setSellexby((java.lang.String)resultRow[index++]);
		result.setSellsp03((java.math.BigDecimal)resultRow[index++]);
	}

	@Override
	public Object[] getKeyMemberValues(final Object object) {
		final Key_FxRate86 entity = (Key_FxRate86)object;
		final Object[] result = new Object[3];
		int index = 0;
		result[index++] = entity.getBranch();
		result[index++] = entity.getCode53();
		result[index++] = entity.getCurren49();
		return result;
	}

	@Override
	public Object[] getMemberValues(final Object object) {
		final FxRate86 entity = (FxRate86)object;
		final Object[] result = new Object[11];
		int index = 0;
		result[index++] = entity.getTypeflag();
		result[index++] = entity.getTstamp();
		result[index++] = entity.getBuyexc03();
		result[index++] = entity.getBuyperspd();
		result[index++] = entity.getBuyexby();
		result[index++] = entity.getBuyspr07();
		result[index++] = entity.getMnt_in_bo();
		result[index++] = entity.getSellex99();
		result[index++] = entity.getSellperspd();
		result[index++] = entity.getSellexby();
		result[index++] = entity.getSellsp03();
		return result;
	}

	@Override
	public Object[] getMemberValuesForMember(final String memberName, final Object object) {
		throw new IllegalArgumentException("Not a complex member: " + memberName);
	}

	@Override
	public boolean requiresOptimisticLocking() {
		return false;
	}

	@Override
	public Object[] extractKeyValues(ResultSet resultSet) throws SQLException {
		return super.extractKeyValues(resultSet);
	}

	@Override
	public int bindKeyValues(Object[] keyValues, PreparedStatement stmt, final int startIndex) throws SQLException {
		return super.bindKeyValues(keyValues, stmt, startIndex);
	}

    @Override
	public Object getKeyFromEntity(final Object entity) {
		return (((FxRate86)entity).get$key());
	}

}
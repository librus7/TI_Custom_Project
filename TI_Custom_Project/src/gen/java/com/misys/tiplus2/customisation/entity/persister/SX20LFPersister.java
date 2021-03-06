package com.misys.tiplus2.customisation.entity.persister;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.misys.tiplus2.persistent.EntityPersister;
import com.misys.tiplus2.customisation.entity.SX20LF;
import com.misys.tiplus2.customisation.entity.SX20LF.Key_SX20LF;

@SuppressWarnings("unchecked")
public class SX20LFPersister extends EntityPersister {

	// This code will be generated by the builder 
	
	public SX20LFPersister() {
		setKeyMembers(new MemberDescriptor[] {
            new MemberDescriptor("addrtype", "SX20LF.ADDRTYPE", getBinderFactory().getBinderForType("Long")),
            new MemberDescriptor("sequence", "SX20LF.SEQUENCE", getBinderFactory().getBinderForType("Integer")),
            new MemberDescriptor("sxcus1_sbb", "SX20LF.SXCUS1_SBB", getBinderFactory().getBinderForType("String")),
            new MemberDescriptor("sxcus1", "SX20LF.SXCUS1", getBinderFactory().getBinderForType("String")),
		});
			
		setMembers(new MemberDescriptor[] {
            new MemberDescriptor("addr_sbb", "SX20LF.ADDR_SBB", getBinderFactory().getBinderForType("String")),
            new MemberDescriptor("addressee", "SX20LF.ADDRESSEE", getBinderFactory().getBinderForType("String")),
            new MemberDescriptor("numcopies", "SX20LF.NUMCOPIES", getBinderFactory().getBinderForType("Integer")),
            new MemberDescriptor("numdups", "SX20LF.NUMDUPS", getBinderFactory().getBinderForType("Integer")),
            new MemberDescriptor("numorig", "SX20LF.NUMORIG", getBinderFactory().getBinderForType("Integer")),
            new MemberDescriptor("sendintern", "SX20LF.SENDINTERN", getBinderFactory().getBinderForType("String")),
            new MemberDescriptor("email", "SX20LF.EMAIL", getBinderFactory().getBinderForType("String")),
            new MemberDescriptor("svfax", "SX20LF.SVFAX", getBinderFactory().getBinderForType("String")),
            new MemberDescriptor("mnt_in_bo", "SX20LF.MNT_IN_BO", getBinderFactory().getBinderForType("String")),
            new MemberDescriptor("svnaff", "SX20LF.SVNAFF", getBinderFactory().getBinderForType("LongVarchar")),
            new MemberDescriptor("svna2", "SX20LF.SVNA2", getBinderFactory().getBinderForType("String")),
            new MemberDescriptor("svna3", "SX20LF.SVNA3", getBinderFactory().getBinderForType("String")),
            new MemberDescriptor("svna4", "SX20LF.SVNA4", getBinderFactory().getBinderForType("String")),
            new MemberDescriptor("svna5", "SX20LF.SVNA5", getBinderFactory().getBinderForType("String")),
            new MemberDescriptor("svna1", "SX20LF.SVNA1", getBinderFactory().getBinderForType("String")),
            new MemberDescriptor("svphn", "SX20LF.SVPHN", getBinderFactory().getBinderForType("String")),
            new MemberDescriptor("svcsa", "SX20LF.SVCSA", getBinderFactory().getBinderForType("String")),
            new MemberDescriptor("source", "SX20LF.SOURCE", getBinderFactory().getBinderForType("String")),
            new MemberDescriptor("svtlx", "SX20LF.SVTLX", getBinderFactory().getBinderForType("String")),
            new MemberDescriptor("svc08", "SX20LF.SVC08", getBinderFactory().getBinderForType("String")),
            new MemberDescriptor("svxm", "SX20LF.SVXM", getBinderFactory().getBinderForType("String")),
            new MemberDescriptor("svpzip", "SX20LF.SVPZIP", getBinderFactory().getBinderForType("String")),
            new MemberDescriptor("svlnm", "SX20LF.SVLNM", getBinderFactory().getBinderForType("String")),
            new MemberDescriptor("svswb", "SX20LF.SVSWB", getBinderFactory().getBinderForType("String")),
            new MemberDescriptor("svswbr", "SX20LF.SVSWBR", getBinderFactory().getBinderForType("String")),
            new MemberDescriptor("svcnas", "SX20LF.SVCNAS", getBinderFactory().getBinderForType("String")),
            new MemberDescriptor("svswl", "SX20LF.SVSWL", getBinderFactory().getBinderForType("String")),
		});

		setForeignKeyMappings(new ForeignKeyMappingDescriptor[] {
		});
	}

    private static final String tableName = "SX20LF";

    /**
     * Gets the table name - in this case SX20LF
     * <p>
     * Note that the <i>schema</i> must be prefixed to this when constructing
     * SQL statements, for example: <code>schema.SX20LF</code>
     * 
     * @return the table name
     */
	@Override
	public String getTableName() {       
		return tableName;
	}

	@Override
	public Class<?> getEntityClass() {
		return SX20LF.class;
	}

	public Class<?> getKeyClass() {
		return Key_SX20LF.class;
	}

	@Override
	public SX20LF constructEntity(final Object[] keyValues, final Object[] resultRow) {
		final SX20LF entity = new SX20LF();
		
		// Key members
		final Key_SX20LF key = entity.get$key();
		assignKeyValues(key, keyValues);

		assignMemberValues(entity, resultRow);
		
		return entity;
	}
	
	@Override
	public Key_SX20LF constructKey(final Object[] keyValues) {
		final Key_SX20LF key = new Key_SX20LF();
		assignKeyValues(key, keyValues);
		return key;
	}
	
	@Override
	public void assignKeyValues(final Object object, final Object[] resultRow) {
		final Key_SX20LF result = (Key_SX20LF)object;
		int index = 0;
		result.setAddrtype((java.lang.Long)resultRow[index++]);
		result.setSequence((java.lang.Integer)resultRow[index++]);
		result.setSxcus1_sbb((java.lang.String)resultRow[index++]);
		result.setSxcus1((java.lang.String)resultRow[index++]);
	}
	
	@Override
	public void assignMemberValues(final Object object, final Object[] resultRow) {
		final SX20LF result = (SX20LF)object;
		int index = 0;
		result.setAddr_sbb((java.lang.String)resultRow[index++]);
		result.setAddressee((java.lang.String)resultRow[index++]);
		result.setNumcopies((java.lang.Integer)resultRow[index++]);
		result.setNumdups((java.lang.Integer)resultRow[index++]);
		result.setNumorig((java.lang.Integer)resultRow[index++]);
		result.setSendintern((java.lang.String)resultRow[index++]);
		result.setEmail((java.lang.String)resultRow[index++]);
		result.setSvfax((java.lang.String)resultRow[index++]);
		result.setMnt_in_bo((java.lang.String)resultRow[index++]);
		result.setSvnaff((java.lang.String)resultRow[index++]);
		result.setSvna2((java.lang.String)resultRow[index++]);
		result.setSvna3((java.lang.String)resultRow[index++]);
		result.setSvna4((java.lang.String)resultRow[index++]);
		result.setSvna5((java.lang.String)resultRow[index++]);
		result.setSvna1((java.lang.String)resultRow[index++]);
		result.setSvphn((java.lang.String)resultRow[index++]);
		result.setSvcsa((java.lang.String)resultRow[index++]);
		result.setSource((java.lang.String)resultRow[index++]);
		result.setSvtlx((java.lang.String)resultRow[index++]);
		result.setSvc08((java.lang.String)resultRow[index++]);
		result.setSvxm((java.lang.String)resultRow[index++]);
		result.setSvpzip((java.lang.String)resultRow[index++]);
		result.setSvlnm((java.lang.String)resultRow[index++]);
		result.setSvswb((java.lang.String)resultRow[index++]);
		result.setSvswbr((java.lang.String)resultRow[index++]);
		result.setSvcnas((java.lang.String)resultRow[index++]);
		result.setSvswl((java.lang.String)resultRow[index++]);
	}

	@Override
	public Object[] getKeyMemberValues(final Object object) {
		final Key_SX20LF entity = (Key_SX20LF)object;
		final Object[] result = new Object[4];
		int index = 0;
		result[index++] = entity.getAddrtype();
		result[index++] = entity.getSequence();
		result[index++] = entity.getSxcus1_sbb();
		result[index++] = entity.getSxcus1();
		return result;
	}

	@Override
	public Object[] getMemberValues(final Object object) {
		final SX20LF entity = (SX20LF)object;
		final Object[] result = new Object[27];
		int index = 0;
		result[index++] = entity.getAddr_sbb();
		result[index++] = entity.getAddressee();
		result[index++] = entity.getNumcopies();
		result[index++] = entity.getNumdups();
		result[index++] = entity.getNumorig();
		result[index++] = entity.getSendintern();
		result[index++] = entity.getEmail();
		result[index++] = entity.getSvfax();
		result[index++] = entity.getMnt_in_bo();
		result[index++] = entity.getSvnaff();
		result[index++] = entity.getSvna2();
		result[index++] = entity.getSvna3();
		result[index++] = entity.getSvna4();
		result[index++] = entity.getSvna5();
		result[index++] = entity.getSvna1();
		result[index++] = entity.getSvphn();
		result[index++] = entity.getSvcsa();
		result[index++] = entity.getSource();
		result[index++] = entity.getSvtlx();
		result[index++] = entity.getSvc08();
		result[index++] = entity.getSvxm();
		result[index++] = entity.getSvpzip();
		result[index++] = entity.getSvlnm();
		result[index++] = entity.getSvswb();
		result[index++] = entity.getSvswbr();
		result[index++] = entity.getSvcnas();
		result[index++] = entity.getSvswl();
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
		return (((SX20LF)entity).get$key());
	}

}

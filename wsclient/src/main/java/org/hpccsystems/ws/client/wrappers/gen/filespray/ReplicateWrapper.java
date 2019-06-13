package org.hpccsystems.ws.client.wrappers.gen.filespray;



/*******************************************************************************
 * HPCC SYSTEMS software Copyright (C) 2019 HPCC Systems.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: ReplicateWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.Replicate
 * Output package : org.hpccsystems.ws.client.wrappers.gen.filespray
 * TimeStamp: 2019-08-13T16:30:50.925Z
 */
public class ReplicateWrapper
{
protected String local_sourceLogicalName;
protected int local_replicateOffset;
protected String local_cluster;
protected boolean local_repeatLast;
protected boolean local_onlyRepeated;
protected String local_dFUServerQueue;

	public ReplicateWrapper() {}

	public ReplicateWrapper( org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.Replicate replicate)
	{
		copy( replicate );
	}
	public ReplicateWrapper( String _sourceLogicalName, int _replicateOffset, String _cluster, boolean _repeatLast, boolean _onlyRepeated, String _dFUServerQueue )
	{
		this.local_sourceLogicalName = _sourceLogicalName;
		this.local_replicateOffset = _replicateOffset;
		this.local_cluster = _cluster;
		this.local_repeatLast = _repeatLast;
		this.local_onlyRepeated = _onlyRepeated;
		this.local_dFUServerQueue = _dFUServerQueue;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.Replicate raw )
	{
		if (raw == null)
			return;

		this.local_sourceLogicalName = raw.getSourceLogicalName();
		this.local_replicateOffset = raw.getReplicateOffset();
		this.local_cluster = raw.getCluster();
		this.local_repeatLast = raw.getRepeatLast();
		this.local_onlyRepeated = raw.getOnlyRepeated();
		this.local_dFUServerQueue = raw.getDFUServerQueue();

	}

	@Override
	public String toString()
	{
		return "ReplicateWrapper [" + "sourceLogicalName = " + local_sourceLogicalName + ", " + "replicateOffset = " + local_replicateOffset + ", " + "cluster = " + local_cluster + ", " + "repeatLast = " + local_repeatLast + ", " + "onlyRepeated = " + local_onlyRepeated + ", " + "dFUServerQueue = " + local_dFUServerQueue + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.Replicate getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.Replicate raw = new org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.Replicate();
		raw.setSourceLogicalName( local_sourceLogicalName);
		raw.setReplicateOffset( local_replicateOffset);
		raw.setCluster( local_cluster);
		raw.setRepeatLast( local_repeatLast);
		raw.setOnlyRepeated( local_onlyRepeated);
		raw.setDFUServerQueue( local_dFUServerQueue);
		return raw;
	}


	public void setSourceLogicalName( String _sourceLogicalName )
	{
		this.local_sourceLogicalName = _sourceLogicalName;
	}
	public String getSourceLogicalName( )
	{
		return this.local_sourceLogicalName;
	}
	public void setReplicateOffset( int _replicateOffset )
	{
		this.local_replicateOffset = _replicateOffset;
	}
	public int getReplicateOffset( )
	{
		return this.local_replicateOffset;
	}
	public void setCluster( String _cluster )
	{
		this.local_cluster = _cluster;
	}
	public String getCluster( )
	{
		return this.local_cluster;
	}
	public void setRepeatLast( boolean _repeatLast )
	{
		this.local_repeatLast = _repeatLast;
	}
	public boolean getRepeatLast( )
	{
		return this.local_repeatLast;
	}
	public void setOnlyRepeated( boolean _onlyRepeated )
	{
		this.local_onlyRepeated = _onlyRepeated;
	}
	public boolean getOnlyRepeated( )
	{
		return this.local_onlyRepeated;
	}
	public void setDFUServerQueue( String _dFUServerQueue )
	{
		this.local_dFUServerQueue = _dFUServerQueue;
	}
	public String getDFUServerQueue( )
	{
		return this.local_dFUServerQueue;
	}
}
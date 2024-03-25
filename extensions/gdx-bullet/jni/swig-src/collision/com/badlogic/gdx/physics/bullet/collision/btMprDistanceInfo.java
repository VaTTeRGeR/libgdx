/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;

public class btMprDistanceInfo extends BulletBase {
	private long swigCPtr;

	protected btMprDistanceInfo (final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}

	/** Construct a new btMprDistanceInfo, normally you should not need this constructor it's intended for low-level usage. */
	public btMprDistanceInfo (long cPtr, boolean cMemoryOwn) {
		this("btMprDistanceInfo", cPtr, cMemoryOwn);
		construct();
	}

	@Override
	protected void reset (long cPtr, boolean cMemoryOwn) {
		if (!destroyed) destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}

	public static long getCPtr (btMprDistanceInfo obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize () throws Throwable {
		if (!destroyed) destroy();
		super.finalize();
	}

	@Override
	protected synchronized void delete () {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CollisionJNI.delete_btMprDistanceInfo(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

	public void setPointOnA (btVector3 value) {
		CollisionJNI.btMprDistanceInfo_pointOnA_set(swigCPtr, this, btVector3.getCPtr(value), value);
	}

	public btVector3 getPointOnA () {
		long cPtr = CollisionJNI.btMprDistanceInfo_pointOnA_get(swigCPtr, this);
		return (cPtr == 0) ? null : new btVector3(cPtr, false);
	}

	public void setPointOnB (btVector3 value) {
		CollisionJNI.btMprDistanceInfo_pointOnB_set(swigCPtr, this, btVector3.getCPtr(value), value);
	}

	public btVector3 getPointOnB () {
		long cPtr = CollisionJNI.btMprDistanceInfo_pointOnB_get(swigCPtr, this);
		return (cPtr == 0) ? null : new btVector3(cPtr, false);
	}

	public void setNormalBtoA (btVector3 value) {
		CollisionJNI.btMprDistanceInfo_normalBtoA_set(swigCPtr, this, btVector3.getCPtr(value), value);
	}

	public btVector3 getNormalBtoA () {
		long cPtr = CollisionJNI.btMprDistanceInfo_normalBtoA_get(swigCPtr, this);
		return (cPtr == 0) ? null : new btVector3(cPtr, false);
	}

	public void setDistance (float value) {
		CollisionJNI.btMprDistanceInfo_distance_set(swigCPtr, this, value);
	}

	public float getDistance () {
		return CollisionJNI.btMprDistanceInfo_distance_get(swigCPtr, this);
	}

	public btMprDistanceInfo () {
		this(CollisionJNI.new_btMprDistanceInfo(), true);
	}

}

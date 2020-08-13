package org.dxctraining.dao;

import org.dxctraining.entities.Iteam;

public interface Dao {

	Iteam findIteamById(int id);

	Iteam update(Iteam iteam);

	Iteam save(Iteam iteam);

    void remove(int id);
}

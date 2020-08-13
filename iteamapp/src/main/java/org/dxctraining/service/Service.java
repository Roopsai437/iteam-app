package org.dxctraining.service;

import org.dxctraining.entites.Iteam;

public interface Service {
	Iteam findIteamById(int id);

	Iteam update(Iteam iteam);

	Iteam save(Iteam iteam);

    void remove(int id);
}

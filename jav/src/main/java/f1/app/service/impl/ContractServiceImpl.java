package f1.app.service.impl;

import cn.hyperchain.sdk.account.Account;
import cn.hyperchain.sdk.transaction.Transaction;
import f1.app.base.constant.Code;
import f1.app.base.exceptions.DeployException;
import f1.app.repository.ContractRepository;
import f1.app.service.ContractService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Author: chenquan
 * Date: 2018/11/12
 * Package: f1.app.service.impl
 * Description:
 */
@Service
public class ContractServiceImpl implements ContractService {
    @Autowired
    ContractRepository contractRepository;

    @Override public String delpoy(String contractName) {
        String payload = null;
        try {
            Account account = new Account(contractRepository.queryAccountJson(""));
            Transaction deployTx = new Transaction.HVMBuilder(account.getAddress()).deploy("contract/" + contractRepository.queryContractJarName()).build();
            return contractRepository.deploy(deployTx, contractName, false);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DeployException(Code.DEPLOY_FAILED, e.getMessage());
        }
    }
}
